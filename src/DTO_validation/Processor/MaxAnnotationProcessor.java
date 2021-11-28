package DTO_validation.Processor;

import DTO_validation.Annotation.Max;
import DTO_validation.Annotation.Min;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor <T> {

    public String[] maxAnnotationMeth(T dto) throws NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = new String [0];
        for (Field fields : declaredFields) {
            if ( fields.isAnnotationPresent(Max.class)) {
                Max annotationMax = fields.getAnnotation(Max.class);
                fields.setAccessible(true);
                if (fields.get(dto) instanceof Number) {
                    int obj = (int) fields.get(dto);
                    int maxValu = annotationMax.valueMax();
                    if (obj > maxValu) {
                        errors = new String[1];
                        errors[0] = annotationMax.maxErrorMessage();
                    }
                } else {
                    // todo throw an exception if field type is incorrect - AnnotationIncorrectUsageException
                  throw new AnnotationIncorrectUsageException(" Max annotatin is can not be used"+ fields.getType() +"fields");
                }
            }
        }
        return errors;
    }
}
