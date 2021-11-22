package algorithms;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class LengthAnnotationProcess {


    public void checkName(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Length annotation = field.getAnnotation(Length.class);
                CustomerDto customerDto = (CustomerDto) object;
                String fieldValue = customerDto.getName();
                if (fieldValue.length() < annotation.min() || fieldValue.length() > annotation.max()) {
                    System.out.println("Does not match");
                } else {
                    System.out.println(customerDto.getName());
                }


            }
        }
    }
}
