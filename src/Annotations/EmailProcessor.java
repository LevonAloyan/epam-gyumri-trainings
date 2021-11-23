package Annotations;

//import algorithms.CustomerDto;
//import algorithms.Email;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailProcessor implements AnnotationProcessor {

    @Override
    public void process(Object object) {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                CustomerDto customerDto = (CustomerDto) object;
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-" +
                        "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                System.out.println(customerDto.getEmail().matches(pattern.pattern()));
            }
        }
    }
}
