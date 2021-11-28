package dtoannotations.processors;

import dtoannotations.ValidationProcessor;
import dtoannotations.annotations.Min;
import dtoannotations.validationexceptions.IncorrectValueException;

import java.lang.reflect.Field;

public class MinValidationProcessor implements ValidationProcessor {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String process(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Min.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                    if (fieldValue instanceof Integer) {
                        Integer fieldMinimumValue = (Integer) fieldValue;
                        Min min = declaredField.getAnnotation(Min.class);
                        if (fieldMinimumValue < min.minValue()) {
                            throw new IncorrectValueException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "discount can't be less than " + min.minValue());
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + " wrong field value.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IncorrectValueException e) {
                    e.printStackTrace();
                    message = e.getMessage();
                }
            }
        }
        return message;
    }
}
