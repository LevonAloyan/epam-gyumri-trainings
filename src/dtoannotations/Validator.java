package dtoannotations;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public List<String> validate(Object object) throws IllegalAccessException {
        List<String> list = new ArrayList<>();
        Class<?> objectClass = object.getClass();
        Field[] declaredFields = objectClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldValue = declaredField.get(object);
            if (declaredField.isAnnotationPresent(Length.class) && fieldValue != null) {
                Length length = declaredField.getAnnotation(Length.class);
                if (fieldValue.toString().length() < length.min() || fieldValue.toString().length() > length.max()) {
                    list.add("\"" + declaredField.getName() + "\" " +
                            "Field has an error, it doesn't match the required length. It is - " + fieldValue);
                }
            }
            if (declaredField.isAnnotationPresent(Email.class) && fieldValue != null) {
                Email email = declaredField.getAnnotation(Email.class);
                Pattern pattern = Pattern.compile(email.emailRegex());
                Matcher matcher = pattern.matcher(fieldValue.toString());
                if (!matcher.matches()) {
                        list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "its value contains unacceptable symbol");
                }
            }
            if (declaredField.isAnnotationPresent(Adulthood.class) && fieldValue != null) {
                int currentYear = LocalDate.now().getYear();
                int year = currentYear - ((LocalDate) fieldValue).getYear();
                if (year < 18) {
                    list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                            "age is - " + year);
                }
            }
            if (declaredField.isAnnotationPresent(Min.class) && fieldValue != null) {
                Min min = declaredField.getAnnotation(Min.class);
                    if ((int) fieldValue < min.minValue()) {
                        list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "discount can't be less than " + fieldValue);
                    }
            }
            if (declaredField.isAnnotationPresent(Max.class) && fieldValue != null) {
                Max max = declaredField.getAnnotation(Max.class);
                if ((int) fieldValue > max.maxValue()) {
                    list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                            "discount can't be more than " + fieldValue);
                }
            }
        }
        return list;
    }
}

