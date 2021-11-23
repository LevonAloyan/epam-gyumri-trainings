package Annotations;

//import annotations.CustomerDto;
//import algorithms.Min;

import java.lang.reflect.Field;

public class MinProcessor implements AnnotationProcessor {

    @Override
    public void process(Object object) {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Min annotation = field.getAnnotation(Min.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valueMin = annotation.value();
                if (fieldValue < valueMin) {
                    System.out.println("It has to be more 0");
                }
            }
        }
    }
}
