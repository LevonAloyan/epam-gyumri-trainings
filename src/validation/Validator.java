package validation;

import validation.processors.*;

import java.util.Arrays;


public class Validator {
    LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();


    public String[] validate(Object dto) throws IllegalAccessException {
        String[] error = new String[5];


        error[0] = Arrays.toString(lengthAnnotationProcessor.validateLength(dto));
        error[1] = emailAnnotationProcessor.validateEmail(dto);
        error[2] = adulthoodAnnotationProcessor.validateAdulthood(dto);
        error[3] = minAnnotationProcessor.validateMin(dto);
        error[4] = maxAnnotationProcessor.validateMax(dto);
   


        return error;
    }


}
