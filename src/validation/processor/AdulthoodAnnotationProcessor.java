package validation.processor;

import validation.annotation.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {
    public String[] adulthoodProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] declaredFields = name.getClass().getDeclaredFields();
        String[] errors = null;
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object o = field.get(name);
                if (o instanceof LocalDate) {

                    Adulthood myAnn = field.getAnnotation(Adulthood.class);
                    field.setAccessible(true);
                    LocalDate fieldValue = (LocalDate) field.get(name);
                    LocalDate today = LocalDate.now();                          //Today's date

                    Period p = Period.between(fieldValue, today);
                    if (p.getYears() < 18) {
                        errors = new String[1];
                        errors[0] = myAnn.message();

                    } else {
                        errors = new String[1];
                        errors[0] = String.format(String.valueOf(fieldValue));
                        ;
                    }

                }


            }
        }
        return errors;
    }
}
