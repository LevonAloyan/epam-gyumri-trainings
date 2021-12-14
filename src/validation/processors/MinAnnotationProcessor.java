package validation.processors;

import validation.annotations.Min;

import java.lang.reflect.Field;

import validation.exception.ValidatorExceptions;

public class MinAnnotationProcessor <T> {
    public String validateMin(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String errors = null;

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    int fieldValue = (int) o;
                    Min annotation = field.getAnnotation(Min.class);

                    if (fieldValue < annotation.value()) {
                        errors = "length less than  " + annotation.value();
                    }
                } else {

                    throw new ValidatorExceptions("Min annotation is not applicable on none Integer fields.");

                }
            }
        }

        return errors;
    }
}
