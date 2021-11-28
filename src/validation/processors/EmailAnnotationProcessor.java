package validation.processors;



import validation.annotations.Email;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailAnnotationProcessor<T>  {
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";


        public String[] emailProcessor(T name) throws IllegalAccessException, NoSuchFieldException {

            Pattern pattern = Pattern.compile(regex);

            Field[] declaredFields = name.getClass().getDeclaredFields();
            String[] errors = null;
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Email.class)) {
                    field.setAccessible(true);
                    Object o = field.get(name);
                    if (o instanceof String) {
                        String fieldValue = (String) o;
                        Email myAnn = field.getAnnotation(Email.class);
                        Matcher matcher = pattern.matcher(fieldValue);
                        if (matcher.find()) {
                            errors = new String[1];
                            errors[0] = fieldValue;
                        } else {
                            errors = new String[1];
                            errors[0] = myAnn.message();
                        }
                    }

                }

            }return errors;
    }
}
