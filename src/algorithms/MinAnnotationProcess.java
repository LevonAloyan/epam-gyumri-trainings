package algorithms;

import java.lang.reflect.Field;

public class MinAnnotationProcess {
    public void checkMin(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Min annotation = field.getAnnotation(Min.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valuesMin = annotation.min();
                if(fieldValue < valuesMin){
                    System.out.println("Point is small");
                }
            }
        }
    }
}

