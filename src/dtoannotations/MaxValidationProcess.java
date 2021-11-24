package dtoannotations;

import java.lang.reflect.Field;

public class MaxValidationProcess {
    public String ValidateMaxAnnotation(Object object) throws IllegalAccessException {
        String text = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (fieldValue != null) {
                if (declaredField.isAnnotationPresent(Max.class)) {
                    Max max = declaredField.getAnnotation(Max.class);
                    if ((int) fieldValue > max.maxValue()) {
                        text = "\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "discount can't be more than " + max.maxValue();
                    }
                }
            } else {
                text = "Field value is null";
            }
        }
        return text;
    }
}
