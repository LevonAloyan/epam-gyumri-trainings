package validation.processors;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import validation.annotation.Email;
import validation.dto.CustomerDto;

public class EmailAnnotationProcessor {
    public String[] validateEmail(Object object) {
        String [] errorMessage = new String[10];
        Class<?> ourClass = object.getClass();
        Field[] declaredField = ourClass.getDeclaredFields();

        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Email email = field.getAnnotation(Email.class);
                CustomerDto customer = (CustomerDto) object;
                Pattern pattern = Pattern.compile(email.emailRegex());
                Matcher matcher = pattern.matcher(declaredField.toString());

                if (!matcher.matches()) {
                    errorMessage[0] = field.getName() + "Field has an error, its value contains intolerable symbol - " + "Email is/ " + customer.getEmail();
                    System.err.println(errorMessage[0]);
                }
            }}
        return errorMessage;
    }
}
