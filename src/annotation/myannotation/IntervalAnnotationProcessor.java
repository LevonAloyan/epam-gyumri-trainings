package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class IntervalAnnotationProcessor {

    private static int min;
    private static int max;


    public static  <T> void definitionFieldsForAnnotationInterval(T object) throws IllegalAccessException, NoSuchFieldException, ExpectedTypeException {

//        initField(object);

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Interval.class)) {
                fieldName.setAccessible(true);

//                System.out.println("Field name: " + fieldName.getName());

                Interval interval = fieldName.getAnnotation(Interval.class);
                min = interval.min();
                max = interval.max();

                Object temp = fieldName.get(object);
                if (temp instanceof Integer) {
                    int value = fieldName.getInt(object);

//                    System.out.println("Field value: " + value);

                    if (value < min || value > max) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: \n"
                                + Interval.class.getName() + "\n");
                    }
                }else {
                    try {
                        throw new ExpectedTypeException();
                    }catch (ExpectedTypeException e){
                        e.printStackTrace();
                    }

                }


            }
        }
    }

//    private static void initField(Object object) {
//
//        Interval interval;
//        Field[] fields = object.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            if (field.isAnnotationPresent(Interval.class)) {
//                interval = field.getAnnotation(Interval.class);
//                min = interval.min();
//                max = interval.max();
//
////                System.out.println(min);
////                System.out.println(max);
//            }
//        }

}




