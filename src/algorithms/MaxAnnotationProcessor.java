package algorithms;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public void checkMax(Object object) throws IllegalAccessException{
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Max annotation = field.getAnnotation(Max.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valueMax = annotation.value();
                if ( fieldValue > valueMax ){
                    System.out.println("More than 100");
                }
            }
        }
    }
}
