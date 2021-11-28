package validation.processors;

import validation.annotations.Min;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T> {

    public String [] minProcessor(T name) throws IllegalAccessException, NoSuchFieldException {
        Field[] declaredFields = name.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(name);

                Min myAnn = field.getAnnotation(Min.class);
                field.setAccessible(true);
                int fieldValue = (int) field.get(name);

                if (fieldValue >= myAnn.min()) {
                    errors = new String[1];
                    errors[0] = String.valueOf(fieldValue);
                } else {
                    errors = new String[1];
                    errors[0] = myAnn.message();
                }

            }

        }return errors;
    }

}
