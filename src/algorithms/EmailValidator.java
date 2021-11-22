package algorithms;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.regex.Pattern;

public class EmailValidator {

    public  String [] validate(Object object) throws IllegalAccessException {
        String [] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field: declaredFields){
            if(field.isAnnotationPresent(Email.class)){
                field.setAccessible(true);
                Email annotation = field.getAnnotation(Email.class);
                Customer customer = (Customer) object;
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-" +
                        "9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                System.out.println(customer.getEmail().matches(pattern.pattern()));

            }
        }


        return errorMessages;
    }
}
