package Annotations;

//import algorithms.CustomerDto;
//import algorithms.Max;

import java.lang.reflect.Field;

public class MaxProcessor implements AnnotationProcessor {

    @Override
    public void process(Object object) {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Max annotation = field.getAnnotation(Max.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valueMax = annotation.value();
                if (fieldValue > valueMax) {
                    System.out.println("More than 100");
                }
            }
        }
    }

}
