package validaton.processor;

import validaton.AbstractValidation;
import validaton.annotation.Email;
import validaton.dto.CostumerDto;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class EmailAnnotationProcessor<T> extends AbstractValidation<T> {

    @Override
    public Set<String> validate(T dto) throws IllegalAccessException {
        Set<String> errors = new HashSet<>();
        String error = validateEmail(dto);
        if(error != null){
            errors.add(error);
        }
        if (next != null){
            errors.addAll(next.validate(dto));

        }


        return errors;
    }

    public String validateEmail(T dto) throws IllegalAccessException {
        Field[] declaredField = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field fields : declaredField) {
            if (fields.isAnnotationPresent(Email.class)) {
                fields.setAccessible(true);
                Object o = fields.get(dto);
                if (o instanceof String) {
                    String email = (String) o;
                    Email annotation = fields.getAnnotation(Email.class);
                    if (!email.matches(annotation.value())) {
                        error = "Email is not  valid";
                    }
                } else {
                    error = "Length annotation is not applicable on none String fields.";
                }
            }

        }
        return error;
    }


}
