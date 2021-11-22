package algorithms;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class LengthValidator {

    public  String [] validate(Object object) throws IllegalAccessException {
        String [] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Length.class)){
                field.setAccessible(true);
                Length annotation = field.getAnnotation(Length.class);
                Customer customer = (Customer) object;
                String fieldValue = customer.getName();
                if(fieldValue.length() < annotation.min() || fieldValue.length() > annotation.max()){
                    System.out.println("do not use");
                }


            }
        }


        return errorMessages;
    }
}
