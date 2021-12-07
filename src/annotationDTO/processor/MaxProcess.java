package annotationDTO.processor;


import annotationDTO.ValidationProcessor;
import annotationDTO.annotation.Max;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.lang.reflect.Field;

public class MaxProcess <V> extends ValidationProcessor<V> {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> void process(T object) {
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
                    System.out.println(e.getMessage());
                }
            }
        }
        if (getNextProcessor() != null) {
            getNextProcessor().process(object);
        }
    }
}