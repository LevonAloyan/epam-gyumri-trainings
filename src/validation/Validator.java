package validation;


import validation.processors.AdulthoodAnotationProcessor;
import validation.processors.EmailAnotationProcessor;
import validation.processors.LengthAnnotationProcessor;
import validation.processors.MaxAnotationProcessor;
import validation.processors.MinAnnotationProcessor;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;


public class Validator<T> {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();

    public Class<?> validateLength(Object dto) throws IllegalAccessException, NoSuchFieldException {

        Class<?> errors = LengthAnnotationProcessor.validate(dto);

        return errors;
    }

    private AdulthoodAnotationProcessor adulthoodAnotationProcessor = new AdulthoodAnotationProcessor();

    public Class<?> validateAdult(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors1 = AdulthoodAnotationProcessor.validate(dto);
        return errors1;
    }

    private EmailAnotationProcessor emailAnotationProcessor = new EmailAnotationProcessor();
    public Class<?> validateEmail(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors2 = EmailAnotationProcessor.validateEmail(dto);
        return errors2;
    }

    private MaxAnotationProcessor maxAnotationProcessor = new MaxAnotationProcessor();
    public Class<?> validateMax(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors3 = MaxAnotationProcessor.validateMax(dto);
        return errors3;

    }

    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
    public Class<?> validateMin(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> errors3 = MinAnnotationProcessor.validateMin(dto);
        return errors3;

    }






}
