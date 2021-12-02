package annotation;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor<T> implements AnnotationInterface <T>{


    public void process(T t) throws IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object lengthSize = field.get(t);
                if (lengthSize instanceof String) {
                    String name = (String) lengthSize;
                    Length annotation = field.getAnnotation(Length.class);

                    if (name.length() < annotation.min() || name.length() > annotation.max()) {
                        System.out.println("You cannot allowed");
                    }
                }else throw new ValidatorException();
            }

        }
    }
}