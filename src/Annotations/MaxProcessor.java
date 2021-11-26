package Annotations;

//import algorithms.CustomerDto;
//import algorithms.Max;

import java.lang.reflect.Field;

public class MaxProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public void process(T object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object o = field.get(object);
                if (o instanceof Number) {
                    Number number = (Number) o;
                    Max annotation = field.getAnnotation(Max.class);
                    int valueMax = annotation.value();
                    if (number.intValue() > valueMax) {
                        System.out.println("More than 100");
                    }
                } else throw new ValidatorException("Type must be Number");
            }
        }
    }

}
