package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Locale;

public class LengthAnnotation {
    public void length(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Length myAnn = field.getAnnotation(Length.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            int maxLen = myAnn.max();
            int minLen = myAnn.min();
            if (maxLen >= fieldValue.length() && minLen <= fieldValue.length()) {
                System.out.println(fieldValue);
            }else {
                System.out.println(myAnn.message());
            }

        }

    }

}

