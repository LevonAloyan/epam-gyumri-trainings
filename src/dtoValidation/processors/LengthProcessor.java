package dtoValidation.processors;

import dtoValidation.annotations.Length;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;

public class LengthProcessor implements AnnotationProcessor{

    @Override
    public Error validate(Dto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String fieldName = field.get(dto).toString();
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
