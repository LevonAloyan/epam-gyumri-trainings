package DTO_validation.processor;

import DTO_validation.annotation.Email;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor<T> extends AnnotationProcessor<T> {

    public static final String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    @Override
    public void validate(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field filed : declaredFields) {
            if (filed.isAnnotationPresent(Email.class)) {
                Email annotation = filed.getAnnotation(Email.class);
                filed.setAccessible(true);
                if (filed.get(dto) instanceof String) {
                    String fieldValue = (String) filed.get(dto);
                    int length = fieldValue.length();
                    if (length != 0 && !fieldValue.matches(EMAIL_REGEX)) {
                        System.out.println("This fields does not contain an email address, ");
                    }
                    getNextProcessor().validate(dto);
                } else {
                    throw new AnnotationIncorrectUsageException("Email annotation is can not  be usd" + filed.getType() + "field");
                }
            }
        }
    }
}