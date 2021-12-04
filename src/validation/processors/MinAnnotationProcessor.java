package validation.processors;

import validation.annotations.Min;
import validation.dto.CustomerDto;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T>extends AnnotationProcessor<T> {

    public String [] validate(T name) throws IllegalAccessException {

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
                getNextProcessor().validate(name);


            }

        }return errors;
    }

}