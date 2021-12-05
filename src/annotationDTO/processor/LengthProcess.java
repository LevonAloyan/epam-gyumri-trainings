package annotationDTO.processor;


import annotationDTO.ValidationProcessor;
import annotationDTO.annotation.Length;
import annotationDTO.exception.LengthException;

import java.lang.reflect.Field;

public class LengthProcess<V> extends ValidationProcessor<V> {

    @SuppressWarnings("unchecked cast")
    @Override
    public <T> void process(T object) {
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
                            throw new LengthException("\"" + declaredField.getName() + "\"" +
                                    " Field has an error, it doesn't match the required length. It is - "
                                    + fieldLength.length());
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + " wrong field value");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (LengthException e) {
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