package validaton.processor;

import validaton.annotation.Length;
import validaton.annotation.Min;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T> {
    public String validateMin(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    Integer fieldValue = (Integer) o;
                    Min annotation = field.getAnnotation(Min.class);
                    if (annotation.value() > fieldValue){
                        error = field.getName() + "length must be greater then " + annotation.value();
                    }
                }
            }
        }
        return error;
    }
}
