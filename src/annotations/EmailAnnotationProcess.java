package annotations;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcess<T> extends AnnotationProcess<T> {

    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])" +
            "?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");

    @Override
    public void process(T object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Object obj =  field.get(object);
                if (obj instanceof String) {
                    String str = (String) obj;
                    System.out.println(str.matches(PATTERN.pattern()));
                } else {
                    throw new ValidatorExceptions("Type must be String");
                }
                getNextProcessor().process(object);
            }
        }
    }
}