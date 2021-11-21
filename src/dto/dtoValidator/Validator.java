package dto.dtoValidator;

import dto.Dto;
import dto.dtoValidator.annotations.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static List<Error> validate(Dto dto) throws IllegalAccessException {
        List<Error> errors = new ArrayList<>();
        Class<?> clazz = dto.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {
                if (Validator.validateLength(field, dto) != null) {
                    errors.add(Validator.validateLength(field, dto));
                }
            }
            if (field.isAnnotationPresent(Email.class)) {
                if (Validator.validateEmail(field, dto) != null) {
                    errors.add(Error.EmailError);
                }
            }
            if (field.isAnnotationPresent(Adulthood.class)) {
                if (Validator.validateAdulthood(field, dto) != null) {
                    errors.add(Error.AdulthoodError);
                }
            }
            if (field.isAnnotationPresent(Min.class)) {
                if (Validator.validateMinLimit(field, dto) != null) {
                    errors.add(Error.MinLimitError);
                }
            }
            if (field.isAnnotationPresent(Max.class)) {
                if (Validator.validateMaxLimit(field, dto) != null) {
                    errors.add(Error.MaxLimitError);
                }
            }
        }
        return errors;
    }


    private static Error validateLength(Field field, Dto dto) throws IllegalAccessException {
        String fieldName = field.get(dto).toString();
        if (fieldName.length() < field.getAnnotation(Length.class).min()) {
            return Error.NameLengthMinSizeError;
        } else if (fieldName.length() > field.getAnnotation(Length.class).max()) {
            return Error.NameLengthMaxSizeError;
        }
        return null;
    }

    private static Error validateEmail(Field field, Dto dto) throws IllegalAccessException {
        String email = field.get(dto).toString();
        final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return null;
        }
        return Error.EmailError;
    }

    private static Error validateAdulthood(Field field, Dto dto) throws IllegalAccessException {
        LocalDate birthday = (LocalDate) field.get(dto);
        LocalDate dateNow = LocalDate.now();
        int year = birthday.getYear();
        int yearNow = dateNow.getYear();
        int age = yearNow - year;
        if (age < 18) {
            return Error.AdulthoodError;
        } else return null;
    }

    private static Error validateMinLimit(Field field, Dto dto) throws IllegalAccessException {
        if ((Integer) field.get(dto) < field.getAnnotation(Min.class).value()) {
            return Error.MinLimitError;
        } else return null;
    }

    private static Error validateMaxLimit(Field field, Dto dto) throws IllegalAccessException {
        if ((Integer) field.get(dto) > field.getAnnotation(Max.class).value()) {
            return Error.MaxLimitError;
        } else return null;
    }

}
