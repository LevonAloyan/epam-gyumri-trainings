package annotation;

import java.lang.reflect.Field;

public class MaxValidator {
    public void max(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Max myAnn = field.getAnnotation(Max.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue <=myAnn.max()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());
            }

        }
    }
}
