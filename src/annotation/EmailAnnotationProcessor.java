package annotation;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor implements AnnotationInterface {
    private final String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0" +
            "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    @Override
    public void process(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Object obj = field.get(object);
                if (obj instanceof String) {

                    String email = (String) obj;
                    Pattern pattern = Pattern.compile(regex);
                    System.out.println(email.matches(pattern.pattern()));
                } else throw new ValidatorException();

            }
        }
    }
}
