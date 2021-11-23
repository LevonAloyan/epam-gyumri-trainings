package validator;

import validator.processors.*;

import java.lang.reflect.Field;

public class Validator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();

    public String [] validate(Object dto) throws IllegalAccessException {
        String [] errors = null;
        String [] validationErrors = new String[5];
        Field[] declaredFields = dto.getClass().getDeclaredFields();

        errors = lengthAnnotationProcessor.validateLength(dto, declaredFields);
        System.arraycopy(errors, 0, validationErrors, 0, errors.length);

        errors = emailAnnotationProcessor.validateEmail(dto, declaredFields);
        System.arraycopy(errors,0, validationErrors, 1, errors.length);

        errors = adulthoodAnnotationProcessor.validateAdulthood(dto, declaredFields);
        System.arraycopy(errors,0, validationErrors, 2, errors.length);

        errors = minAnnotationProcessor.validateMin(dto, declaredFields);
        System.arraycopy(errors,0, validationErrors, 3, errors.length);

        errors = maxAnnotationProcessor.validateMax(dto, declaredFields);
        System.arraycopy(errors,0, validationErrors, 4, errors.length);

        return validationErrors;
    }
}
