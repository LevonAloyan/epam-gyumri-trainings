package validation;

import validation.processors.*;

public class Validator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();


    public String[] maxDiscountValidation(Object dto) throws IllegalAccessException {
        String[] maxValidationErrors = maxAnnotationProcessor.maxValidation(dto);
        return maxValidationErrors;
    }


    public String[] minDiscountValidation(Object dto) throws IllegalAccessException {
        String[] minValidationErrors = minAnnotationProcessor.minValidation(dto);

        return minValidationErrors;
    }

    public String[] adulthoodValidation(Object dto) throws IllegalAccessException {
        String[] adulthoodErrors = adulthoodAnnotationProcessor.AdulthoodValidation(dto);
        return adulthoodErrors;
    }

    public String[] validateEmail(Object dto) throws IllegalAccessException {
        String[] emailErrors = emailAnnotationProcessor.validateEmail(dto);
        return emailErrors;

    }

    public String[] validate(Object dto) throws IllegalAccessException {

        String[] errors;
        errors = lengthAnnotationProcessor.validateLength(dto);
        return errors;
    }


}
