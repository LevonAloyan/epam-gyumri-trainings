package dtoannotations;

import java.lang.reflect.Field;

public class LengthValidatorProcess {

    public String ValidateLengthAnnotation (Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        String text = "";
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (fieldValue != null) {
                if (declaredField.isAnnotationPresent(Length.class)) {
                    Length length = declaredField.getAnnotation(Length.class);
                    if (fieldValue.toString().length() < length.min() || fieldValue.toString().length() > length.max()) {
                        text = "\"" + declaredField.getName() + "\"" +
                                "Field has an error, it doesn't match the required length. It is - "
                                + fieldValue;
                    }
                }
            } else {
                text = "Field value is null";
            }
        }
        return text;
    }
}
