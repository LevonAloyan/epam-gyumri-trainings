package validation.processors;

import validation.Customer;
import validation.annotation.Min;

import java.lang.reflect.Field;

public class MinValidator<T> extends AnnotationProcessor<T> {
    public String[] validate(T object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[1];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof Integer) {
                    Integer email = (Integer) ob;
                    Min annotation = field.getAnnotation(Min.class);
                    Customer customer = (Customer) object;
                    int fieldValue = customer.getDiscountRate();
                    int valueMin = annotation.value();
                    if (fieldValue < valueMin) {
                        System.out.println(" less than needed");
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
