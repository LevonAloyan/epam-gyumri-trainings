package dtoValidation.processors;

import dtoValidation.annotations.Adulthood;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodProcessor<T> implements AnnotationProcessor<T>{

    @Override
    public Error validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                LocalDate birthday = (LocalDate) field.get(t);
                LocalDate dateNow = LocalDate.now();
                int year = birthday.getYear();
                int yearNow = dateNow.getYear();
                int age = yearNow - year;
                if (age < 18) {
                    return Error.AdulthoodError;
                }
            }
        }
        return null;
    }

}
