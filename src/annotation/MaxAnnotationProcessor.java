package annotation;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor implements AnnotationProcessor {
    @Override
    public String [] validate(Object dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Max.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    int value =  (int) o;
                    Max annotation = field.getAnnotation(Max.class);
                    if (value > 100) {
                        errors = new String[1];
                        errors[0] = annotation.message();
                    }
                }
            }
        }catch (Exception exc ){
            errors = new String[0];
        }
        return errors;
    }
}
