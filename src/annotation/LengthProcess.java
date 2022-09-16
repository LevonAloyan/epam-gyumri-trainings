package annotation;


import annotation.exception.LengthException;

import java.lang.reflect.Field;

public class LengthProcess {

    @SuppressWarnings("unchecked cast")
    public static <T> String validateLengthAnnotation(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Length.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (fieldValue instanceof String) {
                    String fieldLength = (String) fieldValue;
                    Length length = declaredField.getAnnotation(Length.class);
                    if (fieldLength.length() < length.min() || fieldLength.length() > length.max()) {
                        try {
                            throw new LengthException("\"" + declaredField.getName() + "\"" +
                                    " Field has an error, it doesn't match the required length. It is - "
                                    + fieldLength.length());
                        } catch (LengthException e) {
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                    }
                } else {
                    throw new IllegalArgumentException(declaredField.getName() + " wrong field value");
                }
            }
        }
        return message;
    }
}
