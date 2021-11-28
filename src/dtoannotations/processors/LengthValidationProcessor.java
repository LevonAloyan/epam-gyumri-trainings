package dtoannotations.processors;

import dtoannotations.ValidationProcessor;
import dtoannotations.annotations.Length;
import dtoannotations.validationexceptions.IncorrectLengthException;

import java.lang.reflect.Field;

public class LengthValidationProcessor implements ValidationProcessor {

    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String process(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Length.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                    if (fieldValue instanceof String) {
                        String fieldLength = (String) fieldValue;
                        Length length = declaredField.getAnnotation(Length.class);
                        if (fieldLength.length() < length.min() || fieldLength.length() > length.max()) {
                            throw new IncorrectLengthException("\"" + declaredField.getName() + "\"" +
                                    " Field has an error, it doesn't match the required length. It is - "
                                    + fieldLength.length());
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + " wrong field value");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IncorrectLengthException e) {
                    e.printStackTrace();
                    message = e.getMessage();
                }
            }
        }
        return message;
    }
}
