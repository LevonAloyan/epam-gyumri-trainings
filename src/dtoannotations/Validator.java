package dtoannotations;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Validator {

    public List<String> validate(Object object) throws IllegalAccessException {
        List<String> list = new ArrayList<>();
        Class<?> objectClass = object.getClass();
        Field[] declaredFields = objectClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Object fieldValue = declaredField.get(objectClass);
            if (declaredField.isAnnotationPresent(Length.class)) {
                Length length = declaredField.getAnnotation(Length.class);
                if (fieldValue.toString() != null) {
                    if (fieldValue.toString().length() < length.min() || fieldValue.toString().length() > length.max()) {
                        list.add("\"" + declaredField.getName() + "\" " +
                                "Field has an error, it doesn't match the required length. It is - " + fieldValue);
                    }
                }
            }
            if (declaredField.isAnnotationPresent(Email.class)) {
                List<Character> regex = new ArrayList<>();
                for (int i = '!'; i < 127; i++) {
                    regex.add((char) i);
                }
                if (fieldValue != null) {
                    List<Character> emailValueChars = new ArrayList<>();
                    for (int i = 0; i < fieldValue.toString().length(); i++) {
                        emailValueChars.add(fieldValue.toString().charAt(i));
                    }
                    for (int j = 0; j < regex.size(); j++) {
                        if (!emailValueChars.get(j).equals(regex.get(j))) {
                            list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                    "its value contains unacceptable symbol - "
                                    + emailValueChars.get(j));
                            break;
                        }
                    }
                }
            }
            if (declaredField.isAnnotationPresent(Adulthood.class)) {
                if (fieldValue != null) {
                    LocalDate minAge = LocalDate.of(2001, 1, 1);
                    LocalDate maxAge = LocalDate.of(1960, 1, 1);
                    LocalDate age = (LocalDate) fieldValue;
                    if (age.isBefore(minAge) || age.isAfter(maxAge)) {
                        list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "age is - " + age);
                    }
                }
            }
            if (declaredField.isAnnotationPresent(Min.class) && declaredField.isAnnotationPresent(Max.class)) {
                Min min = declaredField.getAnnotation(Min.class);
                Max max = declaredField.getAnnotation(Max.class);
                if (fieldValue != null) {
                    if ((int) fieldValue < min.minValue() || (int) fieldValue > max.maxValue()) {
                        list.add("\"" + declaredField.getName() + "\" " + "Field has an error, " +
                                "discount can't be - " + fieldValue);
                    }
                }
            }
        }
        return list;
    }
}

