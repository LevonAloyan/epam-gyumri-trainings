package annotation.my_annotation;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {


    public static void definitionFieldsForAnnotationEmail(Object object) throws IllegalAccessException, NoSuchFieldException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Email.class)) {
                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (!EmailValidator.validate(value)) {
                    System.err.println("В классе: " + aClass + "\n в поле: "
                            + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: "
                            + Email.class.getName()+"\n");
                }
            }
        }
    }


}
