package dtoannotations.processors;

import dtoannotations.DTOInterface;
import dtoannotations.annotations.Max;
import dtoannotations.validationexceptions.ValueException;

import java.lang.reflect.Field;

public class MaxValidationProcess implements DTOInterface {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String processor(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Max.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                    if (fieldValue instanceof Integer) {
                        Integer fieldMaxValue = (Integer) fieldValue;
                        Max max = declaredField.getAnnotation(Max.class);
                        if (fieldMaxValue > max.maxValue()) {
                            throw new ValueException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "discount can't be more than " + max.maxValue());
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
