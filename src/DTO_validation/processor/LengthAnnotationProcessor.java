package DTO_validation.processor;

import DTO_validation.annotation.Length;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor<T> extends AnnotationProcessor<T> {

    @Override
    public void validate(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object fieldObj = field.get(dto);
                if (fieldObj instanceof String) {
                    String lengthFieldValue = (String) fieldObj;
                    int length = lengthFieldValue.length();
                    Length annotation = field.getAnnotation(Length.class);
                    int minLength = annotation.minValue();
                    int maxLength = annotation.maxValue();
                    if (length < minLength || length > maxLength) {
                        System.out.println("Name field length is not valid, ");
                    } else {
                        throw new AnnotationIncorrectUsageException("Length annotation is can not  be used " + field.getType() + "fields");
                    }
                    getNextProcessor().validate(dto);
                }
            }
        }
    }
}