package annotation;

import java.lang.reflect.Field;

public class MinValidator {
    public  String [] validate(Object object) {
        String [] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Min.class)){
                field.setAccessible(true);
                Min annotation = field.getAnnotation(Min.class);
                Customer customer = (Customer) object;
                int fieldValue = customer.getDiscountRate();
                int valueMin = annotation.value();
                if (fieldValue < valueMin){
                    System.out.println("Length is less than given min value");
                }
            }
        }

        return errorMessages;
    }
}

