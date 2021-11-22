package algorithms;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class MinValidator {
    public  String [] validate(Object object) throws IllegalAccessException {
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
                    System.out.println("less than needed");
                }


            }
        }


        return errorMessages;
    }
}
