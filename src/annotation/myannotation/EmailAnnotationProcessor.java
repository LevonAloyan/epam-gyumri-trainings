package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor <T> implements AnnotationProcessor<T> {

    @Override
    public void fieldValidation(T object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Email.class)) {

//                System.out.println("Field name: " + field.getName());

                field.setAccessible(true);
                // TODO check if value has necessary type, then do the validation, if not throw a custom exception
                Object temp = field.get(object);
                if (temp instanceof String) {

                    String value = (String) field.get(object);

//                System.out.println("Field value: " + value);
                    if (!EmailValidator.validate(value)) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + field + " значение: " + value + "\n не соответствует требованиям аннотации: "
                                + Email.class.getName() + "\n");
                    }
//                }else {
//                    throw new ExpectedTypeException();
                }
            }
        }
    }
}
/**
 * public <T> void definitionFieldsForAnnotationEmail(T object) throws IllegalAccessException {
 *
 *         Class<?> aClass = object.getClass();
 *         Field[] declaredField = aClass.getDeclaredFields();
 *         for (Field field : declaredField) {
 *             if (field.isAnnotationPresent(Email.class)) {
 *
 * //                System.out.println("Field name: " + field.getName());
 *
 *                 field.setAccessible(true);
 *                 // TODO check if value has necessary type, then do the validation, if not throw a custom exception
 *                 Object temp = field.get(object);
 *                 if (temp instanceof String) {
 *
 *                     String value = (String) field.get(object);
 *
 * //                System.out.println("Field value: " + value);
 *                     if (!EmailValidator.validate(value)) {
 *                         System.err.println("В классе: " + aClass + "\n в поле: "
 *                                 + field + " значение: " + value + "\n не соответствует требованиям аннотации: "
 *                                 + Email.class.getName() + "\n");
 *                     }
 *                 }else {
 * //                    try {
 * //                        throw  new ExpectedTypeException();
 * //                    }catch (ExpectedTypeException e){
 * //                        e.printStackTrace();
 *
 * //                    }
 *                 throw new ExpectedTypeException();
 *                 }
 *             }
 *         }
 *     }
 */


