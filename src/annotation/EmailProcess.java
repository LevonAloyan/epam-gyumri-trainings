package annotation;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import annotation.exception.EmailException;


public class EmailProcess {
    @SuppressWarnings("unchecked cast")
    public static <T> String validateEmailAnnotation(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Email.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (fieldValue instanceof String) {
                    String mailFieldValue = (String) fieldValue;
                    Email email = declaredField.getAnnotation(Email.class);
                    Pattern pattern = Pattern.compile(email.emailRegex());
                    Matcher matcher = pattern.matcher(mailFieldValue);
                    if (!matcher.matches()) {
                        try {
                            throw new EmailException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "its value contains unacceptable symbol");
                        } catch (EmailException e) {
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                    }
                } else {
                    throw new IllegalArgumentException(declaredField.getName() + " wrong field value");
                }
            }
        }
        return message;
    }
}