package validation;

import validation.processors.*;

import java.util.Arrays;

public class Validator {

    LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
    MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();


    public String[] validate(Object dto) throws IllegalAccessException {
        String[] error = new String[5];


        error[0] = Arrays.toString(lengthAnnotationProcessor.validateLength(dto));
        error[1] = Arrays.toString(emailAnnotationProcessor.validateEmail(dto));
        error[2] = Arrays.toString(minAnnotationProcessor.validateMin(dto));
        error[3] = Arrays.toString(maxAnnotationProcessor.validateMax(dto));
        error[4] = Arrays.toString(adulthoodAnnotationProcessor.validateAdulthood(dto));


        return error;
    }
}
