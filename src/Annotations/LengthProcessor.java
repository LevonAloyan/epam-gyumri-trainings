package Annotations;

//import algorithms.CustomerDto;
//import algorithms.Length;

import java.lang.reflect.Field;

public class LengthProcessor implements AnnotationProcessor {

    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorException {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);
                if (ob instanceof String) {
                    String name = (String) ob;
                    Length annotation = field.getAnnotation(Length.class);
                    if (name.length() < annotation.min() || name.length() > annotation.max())
                        System.out.println("Does not match");
                }else throw new ValidatorException("Type must be String");
            }
        }
    }
}
