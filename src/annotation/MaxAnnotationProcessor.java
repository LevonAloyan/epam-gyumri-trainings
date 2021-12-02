package annotation;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor<T> implements AnnotationInterface <T> {


    public void process(T t) throws IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object maxDiscount = field.get(t);
                if (maxDiscount instanceof Number) {
                    Number number = (Number) maxDiscount;
                    Max annotation = field.getAnnotation(Max.class);
                    int valueMin = annotation.value();

                    if (number.intValue() > valueMin) {
                        System.out.println("It has to be less 100");
                    } else throw new ValidatorException();

                }
            }
        }
    }
}
