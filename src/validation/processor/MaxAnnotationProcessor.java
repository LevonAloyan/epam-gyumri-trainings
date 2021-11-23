package validation.processor;

import validation.annotation.Max;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public String [] maxProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
String [] errors=null;
        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Max myAnn = field.getAnnotation(Max.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue <=myAnn.max()) {
                errors[0]= String.valueOf(fieldValue);
            } else {
                errors[0]=myAnn.message();
            }

        }return errors;
    }
}
