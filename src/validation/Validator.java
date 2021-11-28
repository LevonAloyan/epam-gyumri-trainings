package validation;

import validation.dto.CustomerDto;
import validation.processors.*;

import java.util.Arrays;

public class Validator<T> {
    LengthAnnotationProcessor<T> processor = new LengthAnnotationProcessor<>();
    EmailAnnotationProcessor<T> emailProcessor = new EmailAnnotationProcessor<>();
    AdulthoodAnnotationProcessor <T>adulthoodProcessor = new AdulthoodAnnotationProcessor<>();
    MaxAnnotationProcessor <T>maxProcessor = new MaxAnnotationProcessor<>();
    MinAnnotationProcessor<T> minProcessor = new MinAnnotationProcessor<>();

    public String[] validate(T o) throws NoSuchFieldException, IllegalAccessException {
        String[] errors = new String[5];
        errors[0]= Arrays.toString(processor.lengthProcessor(o));
        errors[1]= Arrays.toString(emailProcessor.emailProcessor(o));
        errors[2]= Arrays.toString(adulthoodProcessor.adulthoodProcessor(o));
        errors[3]= Arrays.toString(maxProcessor.maxProcessor(o));
        errors[4]= Arrays.toString(minProcessor.minProcessor(o));
        return errors;


    }
}

