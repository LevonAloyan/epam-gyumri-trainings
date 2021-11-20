package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Locale;

public class CostumeAnnotation {
    public String length(Object name)  {
        Field[] fields = name.getClass().getDeclaredFields();
        String message ="your name is not correct";

        for (Field field : fields) {

            Length myAnn = field.getAnnotation(Length.class);

            int maxLen = myAnn.max();
            int minLen = myAnn.min();
            if (maxLen >= field.getName().length() && minLen <= field.getName().length()) {
                return field.getName();
            }

        }

        return message;
    }
}
