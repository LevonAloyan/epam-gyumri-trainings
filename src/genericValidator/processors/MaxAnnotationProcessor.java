package genericValidator.processors;

import genericValidator.annotations.Max;
import genericValidator.exceptions.NotMatchedTypeException;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor<T> {

    public String[] validateMax(T dto) throws IllegalAccessException{
        String [] errors = new String[1];

        Field[] declaredFields = dto.getClass().getDeclaredFields();

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Max.class)){
                field.setAccessible(true);

                if(field.get(dto) instanceof Integer){
                    int fieldValue = (int) field.get(dto);
                    Max annotation = field.getAnnotation(Max.class);

                    if(fieldValue > annotation.value()){
                        errors[0] = field.getName() + " must be less than " + annotation.value();
                    }
                }else{
                    throw new NotMatchedTypeException("Type is not matched for the required annotation");
                }
            }
        }
        return errors;
    }
}
