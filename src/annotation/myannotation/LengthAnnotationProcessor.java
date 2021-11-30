package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LengthAnnotationProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public void fieldValidation(T object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Length.class)) {

                field.setAccessible(true);

                Object temp = field.get(object);
                if (temp instanceof String) {
                    String value = (String) temp;

//                    System.out.println("Field value: " + value);

                    Length annotation = field.getAnnotation(Length.class);
                    if (value.length() < annotation.min() || value.length() > annotation.max()) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + field + " значение: " + value + "\n не соответствует требованиям аннотации: "
                                + Length.class.getName() + "\n");
                    }
//                } else {
//                    throw new ExpectedTypeException();
                }
            }
//
        }
    }
}
/**
 * public <T> void definitionFieldsForAnnotationLength(T object) throws IllegalAccessException {
 * <p>
 * Class<?> aClass = object.getClass();
 * Field[] declaredField = aClass.getDeclaredFields();
 * for (Field field : declaredField) {
 * if (field.isAnnotationPresent(Length.class)) {
 * <p>
 * field.setAccessible(true);
 * <p>
 * Length annotation = field.getAnnotation(Length.class);
 * minimum = annotation.min();
 * maximum = annotation.max();
 * <p>
 * Object temp = field.get(object);
 * if (temp instanceof String) {
 * String value = (String) temp;
 * <p>
 * <p>
 * //                    System.out.println("Field value: " + value);
 * <p>
 * if (value.length() < minimum || value.length() > maximum) {
 * System.err.println("В классе: " + aClass + "\n в поле: "
 * + field + " значение: " + value + "\n не соответствует требованиям аннотации: "
 * + Length.class.getName() + "\n");
 * }
 * } else {
 * //                    try {
 * //                        throw new ExpectedTypeException();
 * //                    } catch (ExpectedTypeException e) {
 * //                        e.printStackTrace();
 * //                    }
 * throw new ExpectedTypeException();
 * <p>
 * }
 * }
 * //
 * }
 * }
 */

