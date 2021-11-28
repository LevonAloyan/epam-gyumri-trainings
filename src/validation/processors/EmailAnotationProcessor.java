package validation.processors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import validation.annotations.Email;
import validation.annotations.Length;

import java.lang.reflect.Field;



public class EmailAnotationProcessor {

    public static Class<?> validateEmail(Object object) throws IllegalAccessException, NoSuchFieldException {

        Class<?> eClass = object.getClass();
        Field[] declaredField = eClass.getDeclaredFields();
        String [] errors = null;
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Email.class)) {
                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object).toString();
                if (object instanceof String) {
                    String fieldValue = (String) object;
                    Email annotation = field.getAnnotation(Email.class);
                    String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
                    if (!annotation.getClass().getName().contains(ePattern)) {
                        errors = new String[1];
                        errors[0] = field.getName() + " email must contain " + ePattern;
                    }
                } else {
                    errors = new String[1];
                    errors[0] = "Email annotation is not applicable on none String fields.";
                }
            }
        }
        return eClass;
    }

  }


