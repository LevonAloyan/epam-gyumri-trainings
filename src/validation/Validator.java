package validation;

import validation.processors.*;

import java.util.Arrays;


public class Validator {
    LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    AdultAnnotationProcessor adulthoodValidator = new AdultAnnotationProcessor();
    EmailAnnotationProcessor emailValidator = new EmailAnnotationProcessor();
    MinAnnotationProcessor minValidator = new MinAnnotationProcessor();
    MaxAnnotationProcessor maxValidator = new MaxAnnotationProcessor();

    public String[] validate(Object dto) throws IllegalAccessException {
        String[] error = new String[5];


        error[0] = Arrays.toString(lengthAnnotationProcessor.validateLength(dto));
        error[1] = Arrays.toString(emailValidator.validateEmail(dto));
        error[2] = Arrays.toString(minValidator.validateMin(dto));
        error[3] = Arrays.toString(maxValidator.validateMax(dto));
        error[4] = Arrays.toString(adulthoodValidator.validateAdulthood(dto));


        return error;
    }


}
