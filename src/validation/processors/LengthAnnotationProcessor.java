package validation.processors;

import java.lang.reflect.Field;


import validation.annotations.Length;

public class LengthAnnotationProcessor {


    public String[] validateLength(Object dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof String) {
                    String fieldValue = (String) o;
                    int length = fieldValue.length();
                    Length annotation = field.getAnnotation(Length.class);
                    int minLength = annotation.min();
                    int maxLength = annotation.max();

                    if (length < minLength || length > maxLength) {
                        errors = new String[1];
                        errors[0] = field.getName() + " length must be greater then " + minLength + " and less then " + maxLength;
                    }
                } else {
                    errors = new String[1];
                    errors[0] = "Length annotation is not applicable on none String fields.";
                }
            }
        }
        return errors;
    }
}
