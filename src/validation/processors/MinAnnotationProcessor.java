package validation.processors;


import validation.annotations.Min;

import java.lang.reflect.Field;


public class MinAnnotationProcessor {
    public String[] validateMin(Object dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    Integer fieldMin = (Integer) o;
                    Min annotation = field.getAnnotation(Min.class);
                    int value = annotation.value();
                    if (fieldMin < value) {
                        errors = new String[1];
                        errors[0] = field.getName() + "discount must be greater ";
                    }

                }

            }
        }
        return errors;
    }

}

