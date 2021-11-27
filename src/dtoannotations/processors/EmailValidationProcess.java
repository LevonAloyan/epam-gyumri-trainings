package dtoannotations.processors;

import dtoannotations.DTOInterface;
import dtoannotations.annotations.Email;
import dtoannotations.validationexceptions.IncorrectEmailException;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationProcess implements DTOInterface {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String processor(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Email.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                    if (fieldValue instanceof String) {
                        String mailFieldValue = (String) fieldValue;
                        Email email = declaredField.getAnnotation(Email.class);
                        Pattern pattern = Pattern.compile(email.emailRegex());
                        Matcher matcher = pattern.matcher(mailFieldValue);
                        if (!matcher.matches()) {
                            throw new IncorrectEmailException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "its value contains unacceptable symbol");
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + " wrong field value");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IncorrectEmailException e) {
                    e.printStackTrace();
                    message = e.getMessage();
                }
            }
        }
        return message;
    }
}
