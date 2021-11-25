package annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodValidator {
    public  String [] validate(Object object) {
        String [] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                Customer customer = (Customer) object;
                int fieldValue = customer.getAge();
                int valueMin = annotation.value();
                if (fieldValue < valueMin){
                    System.out.println("User must be elder than 17 years old");
                }
            }
        }

        return errorMessages;
    }
}

