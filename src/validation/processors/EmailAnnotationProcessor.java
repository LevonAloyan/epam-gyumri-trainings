package validation.processors;

import validation.annotations.Email;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {
    public String [] validateEmail(Object dto) throws IllegalAccessException {
        Class<?> aClass = dto.getClass();
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = null;
        String standart = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);

                Object o = field.get(dto);
                if (o instanceof String) {
                    String email = (String) o;

                    if (!email.matches(standart)) {
                        errors = new String[1];
                        errors[0] = "Email is can not valided";
                    }

                } else {
                    errors = new String[1];
                    errors[0] = "Email annotation is not applicable on none String fields.";
                }
            }
        }

        return errors;
    }
}
