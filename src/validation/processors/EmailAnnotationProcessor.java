package validation.processors;



import validation.annotations.Email;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;
import java.util.regex.Pattern;


public class EmailAnnotationProcessor <T> {
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