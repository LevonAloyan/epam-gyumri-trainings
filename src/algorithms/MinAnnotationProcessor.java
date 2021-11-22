package algorithms;

import java.lang.reflect.Field;
import java.util.concurrent.Callable;

public class MinAnnotationProcessor {

    public void checkMin(Object object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Min annotation = field.getAnnotation(Min.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valueMin = annotation.value();
                if ( fieldValue < valueMin ){
                    System.out.println("It has to be more 0");
                }
            }
        }
    }
}


