package annotation.my_annotation;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    private static int minimum;
    private static int maximum;


    public static void definitionFieldsForAnnotationLength(Object object) throws IllegalAccessException, NoSuchFieldException {

        initField(object);

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Length.class)) {

                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (value.length() < minimum || value.length() > maximum) {
                    System.err.println("uf aman esim e" + "В классе: " + aClass + "\n в поле: "
                            + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: "
                            + Length.class.getName()+"\n");
                }
            }
        }
    }

    private static void initField(Object object) {

        Length length;
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                length = field.getAnnotation(Length.class);
                minimum = length.min();
                maximum = length.max();
            }
        }

    }

}
