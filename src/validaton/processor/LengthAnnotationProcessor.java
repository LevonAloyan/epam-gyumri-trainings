package validaton.processor;

import validaton.AbstractValidation;
import validaton.annotation.Length;
import validaton.dto.CostumerDto;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class LengthAnnotationProcessor<T> extends AbstractValidation<T> {

    public Set<String> validate(T dto) throws IllegalAccessException {
        Set<String> errors = new HashSet<>();
        String error = validateLength(dto);
        if(error != null){
            errors.add(error);
        }
        if (next != null){
            errors.addAll(next.validate(dto));

        }
        return errors;
    }

    public String validateLength(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof String) {
                    String fieldValue = (String) o;
                    int length = fieldValue.length();
                    Length annotation = field.getAnnotation(Length.class);
                    int minLength = annotation.min();
                    int maxLength = annotation.max();

                    if (length < minLength || length > maxLength) {

                        error = field.getName() + "length must be greater then " + minLength + " and less then " + maxLength;
                    }

                } else {
                    error = "Length annotation is not applicable on none String fields.";
                }
            }

        }
        return error;
    }



}