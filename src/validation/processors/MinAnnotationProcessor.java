package validation.processors;

import validation.annotations.Min;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public  String [] validateMin(Object object) {
        String [] errorMessages = new String[10];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Min.class)){
                field.setAccessible(true);
                Min annotation = field.getAnnotation(Min.class);
                CustomerDto customer = (CustomerDto) object;
                int fieldValue = customer.getDiscountRate();
                int valueMin = annotation.value();
                if (fieldValue < valueMin){
                    System.out.println("Length is min");
                }
            }
        }

        return errorMessages;
    }
}
