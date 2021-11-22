package algorithms;

import pizzeria.Ingredient;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;

public class LengthAnnotationProcessor {

    public void checkQuantity(Object object) throws IllegalAccessException {

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