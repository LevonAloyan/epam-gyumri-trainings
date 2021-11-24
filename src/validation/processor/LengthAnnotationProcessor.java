package validation.processor;

import validation.annotation.Length;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public String[] lengthProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] declaredFields = name.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object o = field.get(name);
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


