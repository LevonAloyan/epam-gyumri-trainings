package annotation;

import java.lang.reflect.Field;

public class MinValidator {
    public void min(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Min myAnn = field.getAnnotation(Min.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue >=myAnn.min()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());
            }

        }
    }
}
