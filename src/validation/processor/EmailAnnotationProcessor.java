package validation.processor;

import validation.annotation.Email;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailAnnotationProcessor {
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public String[] emailProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
        String[] errors = null;
        Field[] fields = name.getClass().getDeclaredFields();
        Pattern pattern = Pattern.compile(regex);

        for (Field field : fields) {
            Email myAnn = field.getAnnotation(Email.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            Matcher matcher = pattern.matcher(fieldValue);
            if (matcher.find()) {
                errors[0] = fieldValue;
            } else {
                errors[0] = myAnn.message();
            }
        }
        return errors;
    }

}
