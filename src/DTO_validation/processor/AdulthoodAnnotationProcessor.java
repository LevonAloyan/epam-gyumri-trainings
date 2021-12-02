package DTO_validation.processor;

import DTO_validation.annotation.Adulthood;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor<T> extends AnnotationProcessor<T> {

    @Override
    public void validate(T dto) throws IllegalAccessException {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                field.setAccessible(true);
                if (field.get(dto) instanceof LocalDate) {
                    LocalDate fieldLocalDateObj = (LocalDate) field.get(dto);
                    Period period = Period.between(fieldLocalDateObj, LocalDate.now());
                    int years = period.getYears();
                    if (years < 18) {
                        System.out.println("The client has not reached the age of majority, ");
                    }
                } else {
                    throw new AnnotationIncorrectUsageException("Adulthood annotation can not be used on " + field.getType() + " field.");
                }
            getNextProcessor().validate(dto);
            }
        }
    }
}
