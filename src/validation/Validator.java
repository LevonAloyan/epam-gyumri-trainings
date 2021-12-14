package validation;

import validation.processors.*;

import java.util.Arrays;


public class Validator <T> {
    LengthAnnotationProcessor<T> lengthAnnotationProcessor = new LengthAnnotationProcessor<>();
    EmailAnnotationProcessor<T> emailAnnotationProcessor = new EmailAnnotationProcessor<>();
    AdulthoodAnnotationProcessor<T> adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor<>();
    MinAnnotationProcessor<T> minAnnotationProcessor = new MinAnnotationProcessor<>();
    MaxAnnotationProcessor<T> maxAnnotationProcessor = new MaxAnnotationProcessor<>();


    public String[] validate(T dto) throws IllegalAccessException {
        String[] error = new String[5];


        error[0] = Arrays.toString(lengthAnnotationProcessor.validateLength(dto));
        error[1] = emailAnnotationProcessor.validateEmail(dto);
        error[2] = adulthoodAnnotationProcessor.validateAdulthood(dto);
        error[3] = minAnnotationProcessor.validateMin(dto);
        error[4] = maxAnnotationProcessor.validateMax(dto);
   


        return error;
    }


}
