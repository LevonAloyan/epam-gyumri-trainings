package validaton.processor;

import validaton.AbstractValidation;
import validaton.annotation.Max;
import validaton.annotation.Min;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class MixAnnotationProcessor <T> extends AbstractValidation<T> {
    @Override
    public Set<String> validate(T dto) throws IllegalAccessException {
        Set<String> errors = new HashSet<>();
        String error = validateMax(dto);
        if(error != null){
            errors.add(error);
        }
        if (next != null){
            errors.addAll(next.validate(dto));

        }
        return errors;
    }

    public String validateMax(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    Integer fieldValue = (Integer) o;
                    Max annotation = field.getAnnotation(Max.class);
                    if (annotation.value() < fieldValue){
                        error = field.getName() + "length must be less then " + annotation.value();
                    }
                }
            }
        }
        return error;
    }


}
