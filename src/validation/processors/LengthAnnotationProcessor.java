package validation.processors;
import java.lang.reflect.Field;

import validation.annotation.Length;

public class LengthAnnotationProcessor {

    public String[] validateLength(Object dto)  throws IllegalAccessException {
        String [] errorMessage = new String[10];
        Class<?> ourClass = dto.getClass();
        Field[] declaredField = ourClass.getDeclaredFields();

        for (Field field : declaredField) {
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
                        errorMessage[0] = field.getName()  + " length must be greater then " + minLength + " and less then " + maxLength + ". Name is '" + fieldValue + "'";
                        System.err.println(errorMessage[0]);
                    }
                }

           }
        }
        return errorMessage;
    }
}
