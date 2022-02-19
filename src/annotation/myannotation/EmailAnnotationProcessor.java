package annotation.myannotation;

import annotation.InvalidData;
import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public InvalidData fieldValidation(T object) throws IllegalAccessException {

        InvalidData invalidData = null;

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                // TODO check if value has necessary type, then do the validation, if not throw a custom exception
                Object temp = field.get(object);
                if (temp instanceof String) {
                    String value = (String) field.get(object);
                    if (!EmailValidator.validate(value)) {
                        invalidData = new InvalidData(aClass, field, value, Email.class);
                    }
                } else {
                    throw new ExpectedTypeException();
                }
            }
        }
        return invalidData;
    }
}
