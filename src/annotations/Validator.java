package annotations;


import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static List<?> validate(Object object) throws IllegalAccessException {
        List<String> list = new ArrayList();
        Class c = object.getClass();

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object fieldValue = field.get(object);
            if (field.isAnnotationPresent(Length.class)) {
                String currentValue = (String)fieldValue;
                if (currentValue.length() < field.getAnnotation(Length.class).min() || currentValue.length() > field.getAnnotation(Length.class).max() || currentValue =="") {
                    list.add("Name does not require the given length."+"\n");
                }
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                LocalDate minAge = LocalDate.of(2003, 01, 01);
                LocalDate currentAge = (LocalDate) fieldValue;
                if (currentAge.isAfter(minAge)) {
                    list.add("Age hasn't reached adulthood age yet."+"\n");
                }
            } else if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                Integer currentValue = (Integer) fieldValue;
                if (currentValue < 0 || currentValue > 100) {
                    list.add("Discount rate cannot be less than 0 or more than 100."+"\n");
                }

            } else if (field.isAnnotationPresent(Email.class)) {
                CharSequence currentEmail = (CharSequence) fieldValue;
                String REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
                Pattern pattern = Pattern.compile(REGEX);
                Matcher matcher = pattern.matcher(currentEmail);
                if (!matcher.matches()) {
                    list.add("Email is not valid"+"\n");
                }
            }
        }
        return list;
    }

}
