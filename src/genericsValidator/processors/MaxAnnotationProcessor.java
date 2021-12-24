package genericsValidator.processors;

import genericsValidator.annotations.Max;
import genericsValidator.exceptions.AnnotationMisusedException;
import genericsValidator.processors.AnnotationProcessor;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor<V> extends AnnotationProcessor<V> {
    @Override
    public String [] validate(V dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Max.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    if (o instanceof Integer) {
                        int fieldValue = (int) o;
                        Max annotation = field.getAnnotation(Max.class);
                        if (fieldValue > annotation.value()) {
                            errors = new String[1];
                            errors[0] = annotation.message();
                        }
//                        getNextProcessor().validate(dto);
                    }
                }
            }
        }catch (Exception exc ){
            throw new AnnotationMisusedException("Value must be less than 100.");
        }
        return errors;
    }
}
