package annotation;

import java.lang.reflect.Field;

public class MinAnnotation {



        public void checkMin(Object object) throws IllegalAccessException {
            Class<?> aClass = object.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();

            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Min.class)) {
                    field.setAccessible(true);
                    Object minDiscount = field.get(object);
                    Number number = (Number)minDiscount;
                    Min annotation = field.getAnnotation(Min.class);
                    int valueMin = annotation.value();

                    if(number.intValue()<valueMin) {
                        System.out.println("It has to be more 0");
                    }



                }
            }
        }
    }

