package annotationDTO.processor;


import annotationDTO.ValidationProcessor;
import annotationDTO.annotation.Adulthood;
import annotationDTO.exception.AgeException;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdultValidProcess <V> extends ValidationProcessor<V> {
    @SuppressWarnings("unchecked cast")
    @Override
    public <T> void process(T object) {
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
                            throw new AgeException("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "age is - " + year);
                        }
                    } else {
                        throw new IllegalArgumentException(declaredField.getName() + "wrong field value.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (AgeException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
        if (getNextProcessor() != null) {
            getNextProcessor().process(object);
        }
    }
}