package annotation;


import annotation.exception.MaxValueException;

import java.lang.reflect.Field;

public class MaxProcess {
    @SuppressWarnings("unchecked cast")
    public static <T> String validateMaxAnnotation(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Max.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (fieldValue instanceof Integer) {
                    Integer fieldMaxValue = (Integer) fieldValue;
                    Max max = declaredField.getAnnotation(Max.class);
                    if (fieldMaxValue > max.maxValue()) {
                        try {
                            throw new MaxValueException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "discount can't be more than " + max.maxValue());
                        } catch (MaxValueException e) {
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
