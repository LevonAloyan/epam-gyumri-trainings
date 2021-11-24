package annotations;

import java.lang.reflect.Field;

public class LengthAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorExceptions {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Length annotation = field.getAnnotation(Length.class);
                Object obj = field.get(object);

                if (obj instanceof String) {
                    String string = (String) obj;
                    if (string.length() < annotation.min() || string.length() > annotation.max()) {
                        System.out.println("Your name is misspelled, please correct it");
                    } else {
                        System.out.println(string);
                    }
                }else{
                        throw new ValidatorExceptions("Type must be Name");
                }
            }
        }
    }
}
