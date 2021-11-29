package genericValidator;

import genericValidator.processors.*;

import java.lang.reflect.Field;

public class genericValidator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();

    public String [] validate(Object dto) throws IllegalAccessException {
        String [] errors = null;
        String [] validationErrors = new String[5];

        errors = lengthAnnotationProcessor.validateLength(dto);
        System.arraycopy(errors, 0, validationErrors, 0, errors.length);

        errors = emailAnnotationProcessor.validateEmail(dto);
        System.arraycopy(errors,0, validationErrors, 1, errors.length);

        errors = adulthoodAnnotationProcessor.validateAdulthood(dto);
        System.arraycopy(errors,0, validationErrors, 2, errors.length);

        errors = minAnnotationProcessor.validateMin(dto);
        System.arraycopy(errors,0, validationErrors, 3, errors.length);

        errors = maxAnnotationProcessor.validateMax(dto);
        System.arraycopy(errors,0, validationErrors, 4, errors.length);

        return validationErrors;
    }
}
