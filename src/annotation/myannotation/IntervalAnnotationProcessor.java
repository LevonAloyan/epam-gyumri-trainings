package annotation.myannotation;

import annotation.InvalidData;
import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class IntervalAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public InvalidData fieldValidation(T object) throws IllegalAccessException {

        InvalidData invalidData = null;

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Interval.class)) {
                fieldName.setAccessible(true);
                Object temp = fieldName.get(object);

                if (temp instanceof Integer) {
                    int value = fieldName.getInt(object);

                    Interval interval = fieldName.getAnnotation(Interval.class);
                    if (value < interval.min() || value > interval.max()) {
                        invalidData = new InvalidData(aClass, fieldName, value, Interval.class);
                    }
                } else {
                    throw new ExpectedTypeException();
                }
            }
        }
        return invalidData;
    }
}



