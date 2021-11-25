package validation.processors;

import validation.Customer;
import validation.annotation.Max;

import java.lang.reflect.Field;

public class MaxValidator implements AnnotationValidator {

    public String[] validate(Object object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof Integer) {
                    Integer email = (Integer) ob;
                    Max annotation = field.getAnnotation(Max.class);
                    Customer customer = (Customer) object;
                    int fieldValue = customer.getDiscountRate();
                    int valueMin = annotation.value();
                    if (fieldValue > valueMin) {
                        System.out.println("more than needed");
                    }

                } else throw new NewCustomException("Is not valid to work");
            }
        }
        return errorMessages;
    }
}
