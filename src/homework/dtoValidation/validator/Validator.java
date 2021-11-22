package homework.dtoValidation.validator;

import homework.dtoValidation.annotations.*;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Validator <T>{

    public static final String REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public String validate(T dto) throws IllegalAccessException {
        StringBuilder errorList = new StringBuilder();
        if (!validateAdulthood(dto)) {
            errorList.append("It is not valid birthDay. ");
        }
        if (!validateEmail(dto)) {
            errorList.append("It is not valid email. ");
        }
        if (!validateLength(dto)) {
            errorList.append("It is not valid name. ");
        }
        if (!validateMinMax(dto)) {
            errorList.append("It is not valid discountRate");
        }
        return errorList.toString();

    }

    private boolean validateAdulthood(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Adulthood.class)) {
                LocalDate localDate = (LocalDate) declaredField.get(dto);
                if (isAdult(localDate)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAdult(LocalDate localDate) {
        if (LocalDate.now().getYear() - localDate.getYear() >= 18) {
            return true;
        }
        return false;
    }

    private boolean validateEmail(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Email.class)) {
                String email = (String) declaredField.get(dto);
                if (email.matches(REGEX)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean validateLength(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Length fieldAnnotation = declaredField.getAnnotation(Length.class);
            String name = (String) declaredField.get(dto);
            if (name.length() > fieldAnnotation.max() || name.length() < fieldAnnotation.min()) {
                return false;
            }
        }
        return true;
    }

    private boolean validateMinMax(T dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(Max.class) && declaredField.isAnnotationPresent(Min.class)) {
                int discountRate = (Integer) declaredField.get(dto);
                int maxValue = declaredField.getAnnotation(Max.class).value();
                int minValue = declaredField.getAnnotation(Min.class).value();
                if (discountRate > maxValue || discountRate < minValue) {
                    return false;
                }
            }
        }
        return true;
    }

}
