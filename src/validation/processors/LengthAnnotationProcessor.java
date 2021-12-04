package validation.processors;

import java.lang.reflect.Field;

import validation.annotations.Length;

public class LengthAnnotationProcessor<T> extends AnnotationProcessor<T> {

    public String[] validate(T name) throws IllegalAccessException {
        Field[] declaredFields = name.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object o = field.get(name);
                if (o instanceof String) {
                    String fieldValue = (String) o;
                    int length = fieldValue.length();
                }
                getNextProcessor().validate(name);

            }
        }
        return errors;
    }
}