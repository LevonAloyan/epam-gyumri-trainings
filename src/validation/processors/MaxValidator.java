package validation.processors;

import validation.annotation.Max;

import java.lang.reflect.Field;

public class MaxValidator <T> extends AnnotationProcessor<T> {

    public String[] validate(T object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[1];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof Integer) {
                    Integer fieldValue = (Integer) ob;
                    Max annotation = field.getAnnotation(Max.class);
                    int valueMin = annotation.value();

                    if (fieldValue > valueMin) {
                        System.out.println(" more than needed");
                    }

                } else {
                    throw new NewCustomException("Is not valid to work");
                }
            }
        }
        if (getNextProcessor() != null) {
            getNextProcessor().validate(object);
        }
        return errorMessages;

    }
}
