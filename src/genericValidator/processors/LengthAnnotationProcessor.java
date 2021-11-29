package genericValidator.processors;

import genericValidator.annotations.Length;
import genericValidator.exceptions.NotMatchedTypeException;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor<T> {

    public String[] validateLength(T dto) throws IllegalAccessException {
        String[] errors = null;

        Field[] declaredFields = dto.getClass().getDeclaredFields();

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Length.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if(o instanceof String){
                    String fieldValue = (String) o;
                    int length = fieldValue.length();
                    Length annotation = field.getAnnotation(Length.class);
                    int minLength = annotation.min();
                    int maxLength = annotation.max();

                    if (length < minLength || length > maxLength){
                        errors = new String[1];
                        errors[0] = field.getName() + " length must be greater than " +
                                minLength + " less than " + maxLength;
                    }

                }else{
                    errors = new String[1];
                    errors[0] = "Length is not applicable on none String fields";

                    throw new NotMatchedTypeException("Type is not matched for the required annotation");
                }
            }
        }
        return errors;
    }
}
