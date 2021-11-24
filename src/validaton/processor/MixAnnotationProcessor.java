package validaton.processor;

import validaton.annotation.Max;
import validaton.annotation.Min;

import java.lang.reflect.Field;

public class MixAnnotationProcessor <T>{
    public String validateMax(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    Integer fieldValue = (Integer) o;
                    Max annotation = field.getAnnotation(Max.class);
                    if (annotation.value() < fieldValue){
                        error = field.getName() + "length must be less then " + annotation.value();
                    }
                }
            }
        }
        return error;
    }
}
