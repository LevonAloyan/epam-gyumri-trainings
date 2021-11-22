package validation;

import validation.processors.LengthAnnotationProcessor;

public class Validator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();

    public String[] validate(Object dto) throws IllegalAccessException {

        String[] errors;

        errors = lengthAnnotationProcessor.validateLength(dto);


        return errors;
    }


}
