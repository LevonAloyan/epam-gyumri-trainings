package validaton.processor;

import validaton.AbstractValidation;
import validaton.annotation.Length;
import validaton.annotation.Min;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class MinAnnotationProcessor<T> extends AbstractValidation<T> {
    @Override
    public Set<String> validate(T dto) throws IllegalAccessException {
        Set<String> errors = new HashSet<>();
        String error = validateMin(dto);
        if(error != null){
            errors.add(error);
        }
        if (next != null){
            errors.addAll(next.validate(dto));

        }
        return errors;
    }

    public String validateMin(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    Integer fieldValue = (Integer) o;
                    Min annotation = field.getAnnotation(Min.class);
                    if (annotation.value() > fieldValue){
                        error = field.getName() + "length must be greater then " + annotation.value();
                    }
                }
            }
        }
        return error;
    }


}
