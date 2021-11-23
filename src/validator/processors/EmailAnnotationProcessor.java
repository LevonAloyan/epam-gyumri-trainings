package validator.processors;

import validator.annotations.Email;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {

    public String[] validateEmail(Object dto, Field[] declairedFields) throws IllegalAccessException{
        String [] errors = new String[1];

        for(Field field : declairedFields){
            if(field.isAnnotationPresent(Email.class)){
                field.setAccessible(true);

                String fieldValue = (String) field.get(dto);
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                        "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                Matcher matcher = pattern.matcher(fieldValue);

                if(!matcher.matches()){
                    errors[0] = "Provided email is not valid.";
                }
            }
        }
        return errors;
    }
}
