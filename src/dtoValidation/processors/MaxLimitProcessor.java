package dtoValidation.processors;

import dtoValidation.annotations.Max;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class MaxLimitProcessor<T> implements AnnotationProcessor<T>{

    @Override
    public Error validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(t) > field.getAnnotation(Max.class).value()) {
                    return Error.MaxLimitError;
                }
            }
        }
        return null;
    }

}
