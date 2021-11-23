package validator.processors;

import validator.annotations.Length;
import validator.dto.CustomerDto;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {

    public String[] validateLength(Object dto, Field[] declaredFields) throws IllegalAccessException {
        String[] errors = null;
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
                    errors[0] = "Length is not applicale on none String fields";
                }
            }
        }
        return errors;
    }
}
