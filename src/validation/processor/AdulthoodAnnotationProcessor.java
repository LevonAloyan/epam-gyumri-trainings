package validation.processor;

import validation.annotation.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {
    public String[] adulthoodProcessor(Object name) throws IllegalAccessException, NoSuchFieldException {
        String[] errors = null;
        Field[] fields = name.getClass().getDeclaredFields();
        for (Field field : fields) {
            Adulthood myAnn = field.getAnnotation(Adulthood.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            LocalDate today = LocalDate.now();                          //Today's date
            LocalDate birthday = LocalDate.parse(fieldValue);
            Period p = Period.between(birthday, today);
            if (p.getYears() < 18) {
                errors[0] = myAnn.message();

            } else {
                errors[0] = fieldValue;
            }

        }
        return errors;
    }
}
