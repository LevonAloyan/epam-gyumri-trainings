package annotation;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailAnnotation {
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public void email(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();
        Pattern pattern= Pattern.compile(regex);

        for (Field field:fields) {
            Email myAnn = field.getAnnotation(Email.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            Matcher matcher= pattern.matcher(fieldValue);
            System.out.println(fieldValue);
        }
    }

}
