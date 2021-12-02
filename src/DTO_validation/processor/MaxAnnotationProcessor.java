package DTO_validation.processor;

import DTO_validation.annotation.Max;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor<T> extends AnnotationProcessor<T> {

    @Override
    public void validate(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field fields : declaredFields) {
            if (fields.isAnnotationPresent(Max.class)) {
                Max annotationMax = fields.getAnnotation(Max.class);
                fields.setAccessible(true);
                if (fields.get(dto) instanceof Number) {
                    int maxObjValue = (int) fields.get(dto);
                    int maxValue = annotationMax.maxValue();
                    if (maxObjValue > maxValue) {
                        System.out.println("The number exceed the limit specified in the parameter. ");
                    }
                } else {
                    throw new AnnotationIncorrectUsageException(" Max annotation is can not be used" + fields.getType() + "fields");
                }
                getNextProcessor().validate(dto);
            }
        }
    }
}
