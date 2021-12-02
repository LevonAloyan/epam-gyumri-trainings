package validation;
import validation.annotation.Min;
import validation.processors.*;
import java.util.Arrays;

public class Validator {

     LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
     EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
     AdulthoodAnnotationProcessor  adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
     MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
     MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();


    public String[] validate(Object dto) throws IllegalAccessException {
        String[] errors = new String[7];

        errors[0] = Arrays.toString(lengthAnnotationProcessor.validateLength(dto));
        errors[1] = Arrays.toString(emailAnnotationProcessor.validateEmail(dto));
        errors[2] = Arrays.toString(adulthoodAnnotationProcessor.validateAdulthood(dto));
        errors[3] = Arrays.toString(maxAnnotationProcessor.validateMax(dto));
        errors[4] = Arrays.toString(minAnnotationProcessor.validateMin(dto));
        return errors;
    }
}