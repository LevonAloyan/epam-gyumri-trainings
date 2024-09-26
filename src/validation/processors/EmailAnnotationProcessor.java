package validation.processors;

import validation.annotations.Email;
import java.lang.reflect.Field;

import  validation.exception.ValidatorExceptions;

public class EmailAnnotationProcessor<T> {

    public String validateEmail(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String errors = null;
        String norm = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);

                Object o = field.get(dto);
                if (o instanceof String) {
                    String email = (String) o;

                    if (!email.matches(norm)) {
                        errors = "Email is not valid";
                    }

                } else {

                    throw new  ValidatorExceptions ("Email annotation is not applicable on none String fields.");
                }
            }
        }

        return errors;
    }
}
