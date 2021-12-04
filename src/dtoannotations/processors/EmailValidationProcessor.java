package dtoannotations.processors;

import dtoannotations.ValidationProcessor;
import dtoannotations.annotations.Email;
import dtoannotations.validationexceptions.IncorrectEmailException;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class
EmailValidationProcessor<V> extends ValidationProcessor<V> {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> void process(T object) {
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
                    System.out.println(e.getMessage());
                }
            }
        }
        if (getNextProcessor() != null) {
            getNextProcessor().process(object);
        }
    }
}
