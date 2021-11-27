package dtoValidation.processors;

import dtoValidation.annotations.Length;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class LengthProcessor<T> implements AnnotationProcessor<T>{

    @Override
    public Error validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String fieldName = field.get(t).toString();
                if (fieldName.length() < field.getAnnotation(Length.class).min()) {
                    return Error.MinLengthError;
                } else if (fieldName.length() > field.getAnnotation(Length.class).max()) {
                    return Error.MaxLengthError;
                }
            }
        }
        return null;
    }

}
