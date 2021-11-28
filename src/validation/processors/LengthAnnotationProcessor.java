package validation.processors;

import java.lang.reflect.Field;


import validation.annotations.Length;

public class LengthAnnotationProcessor {

    public static Class<?> validate(Object object) throws IllegalAccessException, NoSuchFieldException {
        Class<?> lClass = object.getClass();
        Field[] declaredField = lClass.getDeclaredFields();
        String [] errors = null;
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Length.class)) {
                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object).toString();
                if (object instanceof String) {
                    String fieldValue = (String) object;
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

        return lClass;
    }
}