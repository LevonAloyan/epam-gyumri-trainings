package validation.processors;

import validation.Customer;
import validation.annotation.Length;

import java.lang.reflect.Field;

public class LengthValidator <T> extends AnnotationProcessor<T> {

    public String[] validate(T object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[1];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof String) {
                    String email = (String) ob;
                    Length annotation = field.getAnnotation(Length.class);
                    Customer customer = (Customer) object;
                    String fieldValue = customer.getName();
                    if (fieldValue.length() < annotation.min() || fieldValue.length() > annotation.max()) {
                        System.out.println(" do not use");
                    }
                }else {
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
