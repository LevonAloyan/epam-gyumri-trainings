package annotation.my_annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public static void definitionFieldsForAnnotationLength(Object object) throws IllegalAccessException, NoSuchFieldException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Adulthood.class)) {

                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = field.get(object).toString();

                LocalDate localDate = LocalDate.parse(value);
                Period period = Period.between(localDate, LocalDate.now());

                if (period.getYears() < 18) {
                    System.err.println("В классе: " + aClass + "\n в поле: "
                            + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: "
                            + Adulthood.class.getName()+"\n");
                }

            }
        }
    }

}