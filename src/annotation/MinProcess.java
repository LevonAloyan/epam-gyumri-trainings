package annotation;


import annotation.exception.MinValueException;

import java.lang.reflect.Field;

public class MinProcess {
    @SuppressWarnings("unchecked cast")
    public static <T> String validateMinAnnotation(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Min.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (fieldValue instanceof Integer) {
                    Integer fieldMinimumValue = (Integer) fieldValue;
                    Min min = declaredField.getAnnotation(Min.class);
                    if (fieldMinimumValue < min.minValue()) {
                        try {
                            throw new MinValueException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "discount can't be less than " + min.minValue());
                        } catch (MinValueException e) {
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                    }
                } else {
                    throw new IllegalArgumentException(declaredField.getName() + " wrong field value.");
                }
            }
        }
        return message;
    }
}