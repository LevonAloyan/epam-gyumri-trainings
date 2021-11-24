package validation.processors;

import validation.annotations.Max;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public String[] validateMax(Object object) throws IllegalAccessException {
        String[] errorMessages = new String[10];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Max annotation = field.getAnnotation(Max.class);
                CustomerDto customer = (CustomerDto) object;
                int fieldValue = customer.getDiscountRate();
                int valueMax = annotation.value();
                if (fieldValue > valueMax){
                    System.out.println("Length is max");
                }
            }
        }
        return errorMessages;
    }
}
