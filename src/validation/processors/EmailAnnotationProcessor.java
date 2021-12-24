package validation.processors;

import validation.annotations.Email;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {

    public String[] validateEmail(Object dto) throws IllegalAccessException {

        String[] errors = null;
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof String) {
                    String fieldValue = (String) o;

                    String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(fieldValue);
                    if (matcher.matches()) {
                        errors = new String[1];
                        errors[0] = "No errors found";
                    } else {
                        errors = new String[1];
                        errors[0] = "Email form is invalid";
                    }


                }


            }
        }


        return errors;
    }


}
