package annotation;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T>implements AnnotationInterface <T>{


    public void process(T t) throws IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object minDiscount = field.get(t);
                if (minDiscount instanceof Number) {


                    Number number = (Number) minDiscount;
                    Min annotation = field.getAnnotation(Min.class);
                    int valueMin = annotation.value();

                    if (number.intValue() < valueMin) {
                        System.out.println("It has to be more 0");
                    } else throw new ValidatorException();


                }
            }
        }
    }
}

