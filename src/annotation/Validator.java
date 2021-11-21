package annotation;
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
        Field[] decFields = objectClass.getDeclaredFields();
        for (Field field : decFields) {
            field.setAccessible(true);
            Object fieldValue = field.get(object);
            if (field.isAnnotationPresent(Length.class) && fieldValue != null) {
                Length length = field.getAnnotation(Length.class);
                if (fieldValue.toString().length() < length.min() || fieldValue.toString().length() > length.max()) {
                    list.add("\"" + field.getName() + "\" " +
                            "Field has an error, it doesn't match the required length. It is - " + fieldValue);
                }
            }
            if (field.isAnnotationPresent(Email.class) && fieldValue != null) {
                Email email = field.getAnnotation(Email.class);
                Pattern pattern = Pattern.compile(email.emailRegex());
                Matcher matcher = pattern.matcher(fieldValue.toString());
                if (!matcher.matches()) {
                    list.add("\"" + field.getName() + "\" " + "Field has an error, " + "its value contains unacceptable symbol");
                }
            }
            if (field.isAnnotationPresent(Adulthood.class) && fieldValue != null) {
                int currentYear = LocalDate.now().getYear();
                int year = currentYear - ((LocalDate) fieldValue).getYear();
                if (year < 18) {
                    list.add("\"" + field.getName() + "\" " + "Field has an error, " +
                            "age is - " + year);
                }
            }
            if (field.isAnnotationPresent(Min.class) && fieldValue != null) {
                Min min = field.getAnnotation(Min.class);
                if ((int) fieldValue < min.minValue()) {
                    list.add("\"" + field.getName() + "\" " + "Field has an error, " + "discount can't be less than " + fieldValue);
                }
            }
            if (field.isAnnotationPresent(Max.class) && fieldValue != null) {
                Max max = field.getAnnotation(Max.class);
                if ((int) fieldValue > max.maxValue()) {
                    list.add("\"" + field.getName() + "\" " + "Field has an error, " + "discount can't be more than " + fieldValue);
                }
            }
        }
        return list;
    }
}