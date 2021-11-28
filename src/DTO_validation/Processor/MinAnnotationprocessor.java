package DTO_validation.Processor;

import DTO_validation.Annotation.Max;
import DTO_validation.Annotation.Min;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class MinAnnotationprocessor <T> {
    public String[] minAnnotationMeth(T dto) throws NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = new String [0];
        for (Field fields : declaredFields) {
            if (fields.isAnnotationPresent(Min.class) ) {
                Min annotationMin = fields.getAnnotation(Min.class);
                fields.setAccessible(true);
                if (fields.get(dto) instanceof Number) {
                    int obj = (int) fields.get(dto);
                    int minValue = annotationMin.valueMin();
                    if (obj < minValue) {
                        errors = new String[1];
                        errors[0] = annotationMin.minErrorMessage();
                    }
                } else {
                    // todo throw an exception if field type is incorrect - AnnotationIncorrectUsageException
                    throw new AnnotationIncorrectUsageException("Min ann  is can not be used"+ fields.getType() +"fields");
                }
            }
        }
        return errors;
    }
}


