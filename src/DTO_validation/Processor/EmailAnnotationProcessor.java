package DTO_validation.Processor;

import DTO_validation.Annotation.Email;
import DTO_validation.Annotation.Length;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor <T>{

    public static final String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public String[] emailAnnotationMeth(T dto) throws NoSuchFieldException, IllegalAccessException {

        String[] errors = new String[0];
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field filed : declaredFields) {
            if (filed.isAnnotationPresent(Email.class)) {
                Email annotation = filed.getAnnotation(Email.class);
                filed.setAccessible(true);
                if (filed.get(dto) instanceof String) {
                    String fieldValue = (String) filed.get(dto);
                    int length = fieldValue.length();
                        if (length != 0 && !fieldValue.matches(EMAIL_REGEX)) {
                            errors = new String[1];
                            errors[0] = annotation.emailErrorMassage();
                        }
                } else {
                    throw new AnnotationIncorrectUsageException("Email annotation is can not  be usd" + filed.getType() + "field");
                }
            }
        }
        return errors;
    }
}