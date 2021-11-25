package annotation;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailValidator {
    public  String [] validate(Object object) {
        String [] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Email.class)){
                field.setAccessible(true);
                Customer customer = (Customer) object;
                Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
                boolean matches = customer.getEmail().matches(pattern.pattern());
                if (!matches) {
                    System.out.println("Email is not valid");
                }
            }
        }

        return errorMessages;
    }
}

