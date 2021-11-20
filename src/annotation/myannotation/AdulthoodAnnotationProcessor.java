package annotation.myannotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public static void definitionFieldsForAnnotationLength(Object object) throws IllegalAccessException, NoSuchFieldException {

        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Adulthood.class)) {
//                System.out.println("Field name: " + fieldName.getName());

                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object).toString();

//                System.out.println("Field value: " + value);
                LocalDate localDate = LocalDate.parse(value);
                Period period = Period.between(localDate, LocalDate.now());
//                System.out.println(period.getYears());

                if (period.getYears() < 18) {
                    System.err.println("В классе: " + aClass + "\n в поле: "
                            + fieldName + " значение: " + value + "\n не соответствует требованиям аннотации: "
                            + Adulthood.class.getName()+"\n");
                }

            }
        }
    }

}


