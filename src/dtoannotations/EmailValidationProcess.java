package dtoannotations;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationProcess {

    public String ValidateEmailAnnotation (Object object) throws IllegalAccessException {
        String text = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (fieldValue != null) {
                if (declaredField.isAnnotationPresent(Email.class)) {
                    Email email = declaredField.getAnnotation(Email.class);
                    Pattern pattern = Pattern.compile(email.emailRegex());
                    Matcher matcher = pattern.matcher(fieldValue.toString());
                    if (!matcher.matches()) {
                       text = "\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "its value contains unacceptable symbol";
                    }
                }
            }
        }
        return text;
    }
}
