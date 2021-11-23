package validator.processors;

import validator.annotations.Max;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public String[] validateMax(Object dto, Field[] declairedFields) throws IllegalAccessException{
        String [] errors = new String[1];

        for(Field field : declairedFields){
            if(field.isAnnotationPresent(Max.class)){
                field.setAccessible(true);

                int fieldValue = (int) field.get(dto);
                Max annotation = field.getAnnotation(Max.class);

                if(fieldValue > annotation.value()){
                    errors[0] = field.getName() + " must be less than " + annotation.value();
                }
            }
        }
        return errors;
    }
}
