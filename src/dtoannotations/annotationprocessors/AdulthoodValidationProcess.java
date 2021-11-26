package dtoannotations.annotationprocessors;

import dtoannotations.validationexceptions.IncorrectAgeException;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodValidationProcess {
    @SuppressWarnings("unchecked cast")
    public static <T> String validateAdulthoodAnnotation(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Adulthood.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (fieldValue instanceof LocalDate) {
                    LocalDate date = (LocalDate) fieldValue;
                    int currentYear = LocalDate.now().getYear();
                    int year = currentYear - date.getYear();
                    if (year < 18) {
                        try {
                            throw new IncorrectAgeException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "age is - " + year);
                        } catch (IncorrectAgeException e) {
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                    }
                } else {
                    throw new IllegalArgumentException(declaredField.getName() + "wrong field value.");
                }
            }
        }
        return message;
    }
}
