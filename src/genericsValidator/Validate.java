package genericsValidator;

import genericsValidator.exceptions.ValidationException;
import genericsValidator.processors.*;

import java.util.Arrays;

public class Validate <V> {
    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();

    public String[] validate(V dto) throws IllegalArgumentException {
        String[] errors=new String[5];
        try {
            errors [0]= Arrays.toString(lengthAnnotationProcessor.validate(dto));
            errors [1] = Arrays.toString(emailAnnotationProcessor.validate(dto));
            errors [2] = Arrays.toString(adulthoodAnnotationProcessor.validate(dto));
            errors [3] = Arrays.toString(maxAnnotationProcessor.validate(dto));
            errors [4] = Arrays.toString(minAnnotationProcessor.validate(dto));
        }catch (ValidationException e){
            e.printStackTrace();
            throw new ValidationException("Validation error", e);
        }
        return errors;
    }
}

