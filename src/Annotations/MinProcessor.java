package Annotations;

//import annotations.CustomerDto;
//import algorithms.Min;

import java.lang.reflect.Field;

public class MinProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public void process(T object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object o = field.get(object);
                if (o instanceof Number) {
                    Number number = (Number) o;
                    Min annotation = field.getAnnotation(Min.class);
                    int valueMin = annotation.value();
                    if (number.intValue() < valueMin) {
                        System.out.println("It has to be more 0");
                    }
                } else {
                    // todo new custom exception with message
                    throw new ValidatorException("Type must be Number");
                }
            }
        }
    }
}
