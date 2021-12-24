package validation.processors;

import validation.annotations.Min;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {

    public String[] minValidation(Object dto) throws IllegalAccessException {

        String[] errors = null;

        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    int fieldValue = (int) o;
                    Min annotation = field.getAnnotation(Min.class);
                    if (fieldValue < annotation.min()) {
                        errors = new String[1];
                        errors[0] = "Field value is less than should be";
                    } else {
                        errors = new String[1];
                        errors[0] = "No minValidation error found";
                    }
                }
            }
        }


        return errors;
    }

}
