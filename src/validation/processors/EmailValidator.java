package validation.processors;

import validation.annotation.Email;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailValidator <T> implements AnnotationValidator <T> {

    public String[] validate(T object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[1];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Email annotation = field.getAnnotation(Email.class);
                Object ob = field.get(object);
                if (ob instanceof String) {
                    String email = (String) ob;
                    Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-" +
                            "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");

                } else throw new NewCustomException("Is not valid to work");
            }
        }
        return errorMessages;
    }
}
