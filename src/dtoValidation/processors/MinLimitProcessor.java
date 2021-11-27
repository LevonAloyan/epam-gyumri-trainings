package dtoValidation.processors;

import dtoValidation.annotations.Min;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class MinLimitProcessor<T> implements AnnotationProcessor<T>{

    @Override
    public Error validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(t) < field.getAnnotation(Min.class).value()) {
                    return Error.MinLimitError;
                }
            }
        }
        return null;
    }

}
