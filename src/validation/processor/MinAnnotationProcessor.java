package validation.processor;

import validation.annotation.Min;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public String [] minProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
String [] errors= null;
        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Min myAnn = field.getAnnotation(Min.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue >=myAnn.min()) {
                errors[0]= String.valueOf(fieldValue);
            } else {
                errors[0]=myAnn.message();
            }

        }return errors;
    }
}
