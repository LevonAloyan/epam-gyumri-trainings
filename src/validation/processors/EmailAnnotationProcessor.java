package validation.processors;


import validation.annotations.Email;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {
    public String[] validateEmail(Object dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof String) {
                    String fieldEmail = (String) o;

                    if (!fieldEmail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-\n" +
                            "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$ ")) {

                    }
                    errors = new String[1];
                    errors[0] = " ";

                }

            }

        }
        return errors;
    }
}