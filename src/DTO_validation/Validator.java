package DTO_validation;

import DTO_validation.Processor.*;

public class Validator <T> {

    private LengthAnnotationProcessor<T> lengthAnnotationProcessor = new LengthAnnotationProcessor<>();
    private EmailAnnotationProcessor<T> emailAnnotationProcessor = new EmailAnnotationProcessor<>();
    private AdulthoodAnnotationProcessor <T> adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor<>();
    private MaxAnnotationProcessor <T> maxAnnotationProcessor = new MaxAnnotationProcessor<>();
    private MinAnnotationprocessor <T> minAnnotationprocessor = new MinAnnotationprocessor<>();

    public String[] validateMeth(T dto) throws NoSuchFieldException, IllegalAccessException {
        String[] errors = new String[0];

        String[] lengthValidationErrors = lengthAnnotationProcessor.lengthAnnotationMeth(dto);
        errors = appendErrors(errors, lengthValidationErrors);
        String[] emailValidationErrors = emailAnnotationProcessor.emailAnnotationMeth(dto);
        errors = appendErrors(errors, emailValidationErrors);
        String[] adulthoodValidationErrors = adulthoodAnnotationProcessor.adulthoodAnnotationMeth(dto);
        errors = appendErrors(errors, adulthoodValidationErrors);
        String[] maxValidationErrors = maxAnnotationProcessor.maxAnnotationMeth(dto);
        errors = appendErrors(errors, maxValidationErrors);
        String [] minValidationErrors = minAnnotationprocessor.minAnnotationMeth(dto);
        errors = appendErrors(errors, minValidationErrors);

        return errors;
    }

    private String[] appendErrors(String[] initialErrors, String[] newErrors) {
        int size = initialErrors.length + newErrors.length;
        String[] appendErrors = new String[size];
        System.arraycopy(initialErrors, 0, appendErrors, 0, initialErrors.length);
        System.arraycopy(newErrors, 0, appendErrors, appendErrors.length - 1, newErrors.length);

        return appendErrors;
    }
}
