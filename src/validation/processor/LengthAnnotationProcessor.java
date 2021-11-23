package validation.processor;

import validation.annotation.Length;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public String[] lengthProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
        String[] errors = null;
        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Length myAnn = field.getAnnotation(Length.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            int maxLen = myAnn.max();
            int minLen = myAnn.min();
            if (maxLen >= fieldValue.length() && minLen <= fieldValue.length()) {
                errors[0] = fieldValue;
            } else {
                errors[0] = myAnn.message();
            }

        }
        return errors;


    }

}
