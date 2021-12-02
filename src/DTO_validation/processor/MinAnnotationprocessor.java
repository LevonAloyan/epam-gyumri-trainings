package DTO_validation.processor;

import DTO_validation.annotation.Min;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class MinAnnotationprocessor<T> extends AnnotationProcessor<T> {

    @Override
    public void validate(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field fields : declaredFields) {
            if (fields.isAnnotationPresent(Min.class)) {
                Min annotationMin = fields.getAnnotation(Min.class);
                fields.setAccessible(true);
                if (fields.get(dto) instanceof Number) {
                    int minFieldObj = (int) fields.get(dto);
                    int minValue = annotationMin.minValue();
                    if (minFieldObj < minValue) {
                        System.out.println("The number is  less than the limit specified in the parameter.");
                    }
                } else {
                    throw new AnnotationIncorrectUsageException("Min annotation  is can not be used" + fields.getType() + "fields");
                }
            }
        }
    }
}