package annotations;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcess implements AnnotationInterface {
    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorExceptions {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Email annotation = field.getAnnotation(Email.class);
                //todo get Annotation arguments
                 Object obj = field.get(object);

                if (obj instanceof String) {
                    String str = (String) obj;
                    final Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])" +
                            "?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                    System.out.println(str.matches(pattern.pattern()));
                }
                else {
                            throw new ValidatorExceptions("Type must be Email");

                }
            }
        }
    }
}