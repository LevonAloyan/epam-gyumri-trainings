package validator.processors;

import validator.annotations.Min;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {

    public String[] validateMin(Object dto, Field[] declairedFields) throws IllegalAccessException{
        String [] errors = new String[1];

        for(Field field : declairedFields){
            if(field.isAnnotationPresent(Min.class)){
                field.setAccessible(true);

                int fieldValue = (int) field.get(dto);
                Min annotation = field.getAnnotation(Min.class);

                if(fieldValue < annotation.value()){
                    errors[0] = field.getName() + " must be greater than " + annotation.value();
                }
            }
        }
        return errors;
    }
}
