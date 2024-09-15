package annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdultValidProcess {

    public String ValidateAdulthoodAnnotation (Object object) throws IllegalAccessException {
        String text = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (fieldValue != null) {
                if (declaredField.isAnnotationPresent(Adulthood.class)) {
                    int currentYear = LocalDate.now().getYear();
                    int year = currentYear - ((LocalDate) fieldValue).getYear();
                    if (year < 18) {
                        text = "\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "age is - " + year;
                    }
                }
            } else {
                text = "Field value is null";
            }
        }
        return text;
    }
}
