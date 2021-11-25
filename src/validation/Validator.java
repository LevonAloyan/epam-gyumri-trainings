package validation;


import validation.processors.AdulthoodAnotationProcessor;
import validation.processors.EmailAnotationProcessor;
import validation.processors.LengthAnnotationProcessor;
import validation.processors.MaxAnotationProcessor;
import validation.processors.MinAnnotationProcessor;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;


public class Validator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();

    public String[] validate(Object dto) throws IllegalAccessException {

        String[] errors;

        errors = lengthAnnotationProcessor.validateLength(dto);

        return errors;
    }

    private AdulthoodAnotationProcessor adulthoodAnotationProcessor = new AdulthoodAnotationProcessor();

    public Class<?> validateAdult(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors1 = null;
        errors1 = adulthoodAnotationProcessor.validate(dto);
        return errors1;

    }

    private EmailAnotationProcessor emailAnotationProcessor = new EmailAnotationProcessor();
    public String[] validateEmail(Object dto) throws IllegalAccessException {

        String[] errors2;
        errors2 = emailAnotationProcessor.validateEmail(dto);
        return errors2;
    }

    private MaxAnotationProcessor maxAnotationProcessor = new MaxAnotationProcessor();
    public Class<?> validateMax(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors3 = null;
        errors3 = maxAnotationProcessor.validateMax(dto);
        return errors3;

    }

    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    public Class<?> validateMin(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors3 = null;
        errors3 = maxAnotationProcessor.validateMin(dto);
        return errors3;

    }






}
