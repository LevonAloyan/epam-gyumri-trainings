package dtoannotations.processors;

import dtoannotations.DTOInterface;
import dtoannotations.annotations.Min;
import dtoannotations.validationexceptions.ValueException;

import java.lang.reflect.Field;

public class MinValidationProcess implements DTOInterface {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String processor(T object) {
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
                            throw new ValueException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "discount can't be less than " + min.minValue());
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + " wrong field value.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ValueException e) {
                    e.printStackTrace();
                    message = e.getMessage();
                }
            }
        }
        return message;
    }
}
