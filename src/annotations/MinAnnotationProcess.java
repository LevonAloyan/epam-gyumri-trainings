package annotations;

import java.lang.reflect.Field;

public class MinAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorExceptions {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Object obj = field.get(object);

                Min annotation = field.getAnnotation(Min.class);
                if (obj instanceof Number) {
                    Number number = (Number) obj;
                    int valuesMin = annotation.min();
                    if (number.intValue() < valuesMin) {
                        System.out.println("This discount does not exist is very small");
                    }
                }else {
                    throw new ValidatorExceptions("Type must be Number");
                }
            }
        }
    }
}

