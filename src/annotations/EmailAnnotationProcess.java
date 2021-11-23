package annotations;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcess implements AnnotationInterface {
    @Override
    public void process(Object object)  {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Email annotation = field.getAnnotation(Email.class);
                CustomerDto customerDto = (CustomerDto) object;
                final Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])" +
                        "?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                System.out.println(customerDto.getEmail().matches(pattern.pattern()));
            }
        }
    }
}