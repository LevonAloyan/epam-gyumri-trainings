package genericValidator.processors;

import genericValidator.annotations.Email;
import genericValidator.exceptions.NotMatchedTypeException;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor<T> {

    public String[] validateEmail(T dto) throws IllegalAccessException{
        String [] errors = new String[1];

        Field[] declaredFields = dto.getClass().getDeclaredFields();

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Email.class)){
                field.setAccessible(true);

                if(field.get(dto) instanceof String){
                    String fieldValue = (String) field.get(dto);
                    Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                            "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                    Matcher matcher = pattern.matcher(fieldValue);

                    if(!matcher.matches()){
                        errors[0] = "Provided email is not valid.";
                    }
                }else{
                    throw new NotMatchedTypeException("Type is not matched for the required annotation");
                }
            }
        }
        return errors;
    }
}
