package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor<T> implements AnnotationProcessor<T>{

    @Override
    public void fieldValidation(T object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Adulthood.class)) {
//                System.out.println("Field name: " + fieldName.getName());

                fieldName.setAccessible(true);

                Object temp = fieldName.get(object);
                if (temp instanceof LocalDate) {
                    String value = (String) fieldName.get(object).toString();

//                System.out.println("Field value: " + value);
                    LocalDate localDate = LocalDate.parse(value);
                    Period period = Period.between(localDate, LocalDate.now());
//                System.out.println(period.getYears());

                    if (period.getYears() < 18) {
                        System.err.println("В классе: " + aClass + "\n в поле: "
                                + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: "
                                + Adulthood.class.getName() + "\n");
                    }
//                } else {
//                    throw new ExpectedTypeException();
                }
            }
        }
    }
}


