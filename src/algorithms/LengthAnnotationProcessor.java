package algorithms;

import javax.xml.namespace.QName;
import java.lang.reflect.Field;

public class LengthAnnotationProcessor {

    public void checkQuantity(Object object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String name = new String("Dav");
                if (name.length() < 2 || name.length() > 30 ){
                    System.out.println("Does not match");
                }
            }
        }
    }
}