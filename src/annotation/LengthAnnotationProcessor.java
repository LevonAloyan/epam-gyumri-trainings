package annotation;

import java.lang.reflect.Field;

class LengthAnnotationProcessor<V> implements AnnotationProcessor<V> {
    @Override
    public String[] validate(V dto) throws IllegalArgumentException, AnnotationMisusedException{
        Class<?> dtoClass = dto.getClass();
        Field [] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Length.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    if (o instanceof String) {
                        String fieldValue = (String) o;
                        int length = fieldValue.length();
                        Length annotation = field.getAnnotation(Length.class);
                        int minLength = annotation.min();
                        int maxLength = annotation.max();

                        if (length < minLength || length > maxLength) {
                            errors = new String[1];
                            errors[0] = annotation.message();
                        }
                    } else {
                        throw new AnnotationMisusedException("Annotation is not applicable on field.");
                    }
                }
            }
        }catch (Exception exc ){
            errors = new String[0];
        }
        return errors;
    }
}
