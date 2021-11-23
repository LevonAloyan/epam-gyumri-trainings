package dtoValidation.processors;

import dtoValidation.annotations.Min;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class MinLimitProcessor implements AnnotationProcessor{

    @Override
    public Error validate(Dto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(dto) < field.getAnnotation(Min.class).value()) {
                    return Error.MinLimitError;
                }
            }
        }
        return null;
    }

}
