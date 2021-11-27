package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    private static int minimum;
    private static int maximum;


    public static <T> void definitionFieldsForAnnotationLength(T object) throws IllegalAccessException {

//        initField(object);

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Length.class)) {

                field.setAccessible(true);

                Length annotation = field.getAnnotation(Length.class);
                minimum = annotation.min();
                maximum = annotation.max();

                Object temp = field.get(object);
                if (temp instanceof String) {
                    String value = (String) temp;


//                    System.out.println("Field value: " + value);

                    if (value.length() < minimum || value.length() > maximum) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + field + " значение: " + value + "\n не соответствует требованиям аннотации: "
                                + Length.class.getName() + "\n");
                    }
                } else {
                    try {
                        throw new ExpectedTypeException();
                    } catch (ExpectedTypeException e) {
                        e.printStackTrace();
                    }

                }
            }
//
        }
    }

//    private static void initField(Object object) {
//
//        Length length;
//        Field[] fields = object.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            if (field.isAnnotationPresent(Length.class)) {
//                length = field.getAnnotation(Length.class);
//                minimum = length.min();
//                maximum = length.max();
//
////                System.out.println(minimum);
////                System.out.println(maximum);
//            }
//        }
//
//    }

}


