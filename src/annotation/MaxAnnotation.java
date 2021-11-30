package annotation;

import java.lang.reflect.Field;

public class MaxAnnotation  implements AnnotationInterface {


    public void process(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object maxDiscount = field.get(object);
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
