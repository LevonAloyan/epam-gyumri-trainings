package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class IntervalAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public void fieldValidation(T object) throws IllegalAccessException{

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Interval.class)) {
                fieldName.setAccessible(true);

//                System.out.println("Field name: " + fieldName.getName());

                Object temp = fieldName.get(object);
                if (temp instanceof Integer) {
                    int value = fieldName.getInt(object);

//                    System.out.println("Field value: " + value);

                    Interval interval = fieldName.getAnnotation(Interval.class);
                    if (value < interval.min() || value > interval.max()) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: \n"
                                + Interval.class.getName() + "\n");
                    }
//                } else {
//                    throw new ExpectedTypeException();
                }
            }
        }
    }
}
/**
 * public  <T> void definitionFieldsForAnnotationInterval(T object) throws IllegalAccessException {
 * <p>
 * Class<?> aClass = object.getClass();
 * Field[] declaredField = aClass.getDeclaredFields();
 * for (Field fieldName : declaredField) {
 * if (fieldName.isAnnotationPresent(Interval.class)) {
 * fieldName.setAccessible(true);
 * <p>
 * //                System.out.println("Field name: " + fieldName.getName());
 * <p>
 * Interval interval = fieldName.getAnnotation(Interval.class);
 * min = interval.min();
 * max = interval.max();
 * <p>
 * Object temp = fieldName.get(object);
 * if (temp instanceof Integer) {
 * int value = fieldName.getInt(object);
 * <p>
 * //                    System.out.println("Field value: " + value);
 * <p>
 * if (value < min || value > max) {
 * System.err.println("В классе: " + aClass + "\n в поле: "
 * + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: \n"
 * + Interval.class.getName() + "\n");
 * }
 * }else {
 * //                    try {
 * //                        throw new ExpectedTypeException();
 * //                    }catch (ExpectedTypeException e){
 * //                        e.printStackTrace();
 * <p>
 * //                    }
 * throw new ExpectedTypeException();
 * }
 * }
 * }
 * }
 */



