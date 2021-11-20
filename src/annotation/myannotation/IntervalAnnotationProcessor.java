package annotation.myannotation;

import java.lang.reflect.Field;

public class IntervalAnnotationProcessor {

    private static int min;
    private static int max;


    public static void definitionFieldsForAnnotationInterval(Object object) throws IllegalAccessException, NoSuchFieldException {

        initField(object);

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Interval.class)) {

//                System.out.println("Field name: " + fieldName.getName());

                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                int value = field.getInt(object);

//                System.out.println("Field value: " + value);

                if (value < min || value > max) {
                    System.err.println("В классе: " + aClass + "\n в поле: "
                            + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: \n"
                            + Interval.class.getName()+"\n");
                }
            }
        }
    }

    private static void initField(Object object) {

        Interval interval;
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Interval.class)) {
                interval = field.getAnnotation(Interval.class);
                min = interval.min();
                max = interval.max();

//                System.out.println(min);
//                System.out.println(max);
            }
        }

    }

}


