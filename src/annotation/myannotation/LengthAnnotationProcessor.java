package annotation.myannotation;

import annotation.InvalidData;
import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public InvalidData fieldValidation(T object) throws IllegalAccessException {

        InvalidData invalidData = null;

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);

                Object temp = field.get(object);
                if (temp instanceof String) {
                    String value = (String) temp;

                    Length annotation = field.getAnnotation(Length.class);
                    if (value.length() < annotation.min() || value.length() > annotation.max()) {
                        invalidData = new InvalidData(aClass, field, value, Length.class);
                    }
                } else {
                    throw new ExpectedTypeException();
                }
            }
        }
        return invalidData;
    }
}
