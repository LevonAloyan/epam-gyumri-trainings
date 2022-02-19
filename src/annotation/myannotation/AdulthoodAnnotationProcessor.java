package annotation.myannotation;

import annotation.InvalidData;
import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public InvalidData fieldValidation(T object) throws IllegalAccessException {

        InvalidData invalidData = null;

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Adulthood.class)) {
                fieldName.setAccessible(true);

                Object temp = fieldName.get(object);
                if (temp instanceof LocalDate) {
                    String value = (String) fieldName.get(object).toString();

                    LocalDate localDate = LocalDate.parse(value);
                    Period period = Period.between(localDate, LocalDate.now());

                    if (period.getYears() < 18) {
                        invalidData = new InvalidData(aClass, fieldName, value, Adulthood.class);
                    }
                } else {
                    throw new ExpectedTypeException();
                }
            }
        }
        return invalidData;
    }
}


