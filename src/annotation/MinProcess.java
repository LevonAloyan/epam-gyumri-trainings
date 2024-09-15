package annotation;

import java.lang.reflect.Field;

public class MinProcess {
    public String ValidateMinAnnotation(Object object) throws IllegalAccessException {
        String text = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (fieldValue != null) {
                if (declaredField.isAnnotationPresent(Min.class)) {
                    Min min = declaredField.getAnnotation(Min.class);
                    if ((int) fieldValue < min.minValue()) {
                        text = "\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "discount can't be less than " + min.minValue();
                    }
                }
            } else {
                text = "Field value is null";
            }
        }
        return text;
    }
}
