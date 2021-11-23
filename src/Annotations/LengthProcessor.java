package Annotations;

//import algorithms.CustomerDto;
//import algorithms.Length;

import java.lang.reflect.Field;

public class LengthProcessor implements AnnotationProcessor{

    @Override
    public void process(Object object) {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Length annotation = field.getAnnotation(Length.class);
                CustomerDto customerDto = (CustomerDto) object;
                String fieldValue = customerDto.getName();

                if (fieldValue.length() < annotation.min() || fieldValue.length() > annotation.max())
                    System.out.println("Does not match");
            }
        }
    }
}
