package validation.processors;

import validation.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnotationProcessor {


    public static Class<?> validate(Object object) throws IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = object.getClass();
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            if (fieldName.isAnnotationPresent(Adulthood.class)) {
                Field field = object.getClass().getDeclaredField(fieldName.getName());
                field.setAccessible(true);
                String value = (String) field.get(object).toString();
                LocalDate localDate = LocalDate.parse(value);
                Period period = Period.between(localDate, LocalDate.now());
                if (period.getYears() < 18) {
                    System.err.println("In class " + aClass + "\n in field: "
                            + fieldName + " value: " + value + "\n does not meet the annotation requirements: "
                            + Adulthood.class.getName()+"\n");
                }
            }
        }

        return aClass;
    }
}
