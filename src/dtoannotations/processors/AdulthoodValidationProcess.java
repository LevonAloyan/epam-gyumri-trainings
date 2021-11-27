package dtoannotations.processors;

import dtoannotations.DTOInterface;
import dtoannotations.annotations.Adulthood;
import dtoannotations.validationexceptions.IncorrectAgeException;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodValidationProcess implements DTOInterface {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> String processor(T object) {
        String message = "";
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Adulthood.class)) {
                T fieldValue = null;
                try {
                    fieldValue = (T) declaredField.get(object);
                    if (fieldValue instanceof LocalDate) {
                        LocalDate date = (LocalDate) fieldValue;
                        int currentYear = LocalDate.now().getYear();
                        int year = currentYear - date.getYear();
                        if (year < 18) {
                            throw new IncorrectAgeException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "age is - " + year);
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + "wrong field value.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IncorrectAgeException e) {
                    e.printStackTrace();
                    message = e.getMessage();
                }
            }
        }
        return message;
    }
}
