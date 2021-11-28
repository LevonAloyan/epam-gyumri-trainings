package validation.processors;

import validation.annotations.Max;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor<T> {
    public String[] maxProcessor(T name) throws IllegalAccessException, NoSuchFieldException {
        Field[] declaredFields = name.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object o = field.get(name);

                Max myAnn = field.getAnnotation(Max.class);
                field.setAccessible(true);
                int fieldValue = (int) field.get(name);

                if (fieldValue <= myAnn.max()) {
                    errors = new String[1];
                    errors[0] = String.valueOf(fieldValue);
                } else {
                    errors = new String[1];
                    errors[0] = myAnn.message();
                }

            }


        }
        return errors;
    }
}
