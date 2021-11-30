package genericsAnnotation;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<V> implements AnnotationProcessor<V> {
    @Override
    public String [] validate(V dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Min.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                        int value =  (int) o;
                        Min annotation = field.getAnnotation(Min.class);
                        if (value < 0) {
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
