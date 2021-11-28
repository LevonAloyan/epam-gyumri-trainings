package annotation;

import java.lang.reflect.Field;

class EmailAnnotationProcessor<V> implements AnnotationProcessor <V>{
    @Override
    public String[] validate(V dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Email.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    if (o instanceof String) {
                        String strValue = (String) o;
                        Email annotation = field.getAnnotation(Email.class);
                        if (!ValidEmail.validEmail(strValue)) {
                            errors = new String[1];
                            errors[0] = annotation.message();
                        }
                    } else {
                        errors = new String[1];
                        errors[0] = "Length annotation is not applicable on none String fields.";
                    }
                }
            }
        }catch (Exception exc ){
            errors = new String[0];
        }
        return errors;
    }
}
