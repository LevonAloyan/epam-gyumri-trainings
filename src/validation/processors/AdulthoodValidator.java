package validation.processors;

import validation.annotation.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodValidator implements AnnotationValidator {

    public String[] validate(Object object) throws IllegalAccessException, NewCustomException {
        String[] errorMessages = new String[5];

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object fieldValue = field.get(object);
                if (fieldValue instanceof LocalDate) {
                    LocalDate birthDay = (LocalDate) fieldValue;
                    int years = Period.between(birthDay, LocalDate.now()).getYears();
                    if (years < 18) {
                        System.out.println("You are not allowed to sing in");
                    }
                } else throw new NewCustomException("Is not valid to work");

            }


        }
        return errorMessages;
    }
}

