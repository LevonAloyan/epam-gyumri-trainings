package validation.processors;

import validation.Customer;
import validation.annotation.Max;

import java.lang.reflect.Field;

public class MaxValidator <T> implements AnnotationValidator <T> {

    public String[] validate(T object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof Integer) {
                    Integer fieldValue = (Integer) ob;
                    Max annotation = field.getAnnotation(Max.class);
                    int valueMin = annotation.value();

                    if (fieldValue > valueMin) {
                        errorMessages[i++] = field.getName() + " more than needed";
                    }

                } else throw new NewCustomException("Is not valid to work");
            }
        }
        return errorMessages;
    }
}
