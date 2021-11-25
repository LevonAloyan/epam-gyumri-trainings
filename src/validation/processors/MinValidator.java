package validation.processors;

import validation.Customer;
import validation.annotation.Min;

import java.lang.reflect.Field;

public class MinValidator implements AnnotationValidator {
    public String[] validate(Object object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
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
                        System.out.println("less than needed");
                    }


                } else throw new NewCustomException("Is not valid to work");
            }


        }
        return errorMessages;
    }
}
