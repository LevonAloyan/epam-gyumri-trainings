package dtoValidation.processors;

import dtoValidation.annotations.Max;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class MaxLimitProcessor implements AnnotationProcessor{

    @Override
    public Error validate(Dto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(dto) > field.getAnnotation(Max.class).value()) {
                    return Error.MaxLimitError;
                }
            }
        }
        return null;
    }

}
