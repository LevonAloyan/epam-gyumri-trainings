package validation.processors;



import validation.annotations.Email;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;
import java.util.regex.Pattern;


public class EmailAnnotationProcessor  {
    public String[] validateEmail(Object object) {
        String[] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                CustomerDto customer = (CustomerDto) object;
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-" +
                        "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                boolean matches = customer.getEmail().matches(pattern.pattern());
                if (!matches) {
                    System.out.println("Email is not valid");
                }
            }
        }

        return errorMessages;
    }
}
