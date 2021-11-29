package genericValidator.processors;

import genericValidator.annotations.Min;
import genericValidator.exceptions.NotMatchedTypeException;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T> {

    public String[] validateMin(T dto) throws IllegalAccessException{
        String [] errors = new String[1];

        Field[] declaredFields = dto.getClass().getDeclaredFields();

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Min.class)){
                field.setAccessible(true);

                if(field.get(dto) instanceof Integer){
                    int fieldValue = (int) field.get(dto);
                    Min annotation = field.getAnnotation(Min.class);

                    if(fieldValue < annotation.value()){
                        errors[0] = field.getName() + " must be greater than " + annotation.value();
                    }
                }else{
                   throw new NotMatchedTypeException("Type is not matched for the required annotation");
                }
            }
        }
        return errors;
    }
}
