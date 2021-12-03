package validation.processors;

import java.lang.reflect.Field;


import validation.annotations.Adulthood;
import validation.dto.CustomerDto;

public class AdultAnnotationProcessor {
    public  String [] validateAdulthood(Object object) {
        String [] errorMessages = new String[10];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                CustomerDto customer = (CustomerDto) object;
                int fieldValue = customer.getAdulthood();
                int valueMin = annotation.value();
                if (fieldValue < valueMin){
                    System.out.println("User must be Adulthood");
                }
            }
        }

        return errorMessages;
    }
}
