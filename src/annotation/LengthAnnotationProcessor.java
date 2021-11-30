package annotation;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor implements AnnotationInterface {


    public void process(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object lengthSize = field.get(object);
                if (lengthSize instanceof String) {
                    String name = (String) lengthSize;
                    Length annotation = field.getAnnotation(Length.class);

                    if (name.length() < annotation.min() || name.length() > annotation.max()) ;
                    System.out.println("You cannot allowed");
                }else throw new ValidatorException();
            }

        }
    }
}