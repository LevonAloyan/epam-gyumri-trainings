package validation;

import validation.anotation.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator{

    private static final String REGEX =
            "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\." +
                    "" +
                    "[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static List<?> validate(Object object) throws IllegalAccessException {
        List<String> arrayList = new ArrayList<>();
        Class<?> cllassObject = object.getClass();

        Field[] fields = cllassObject.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object fieldValue = field.get(object);
            if (field.isAnnotationPresent(Length.class)) {
                String currentValue = (String) fieldValue;
                if (currentValue.length() < field.getAnnotation(Length.class).min() || currentValue.length() >
                        field.getAnnotation(Length.class).max() || currentValue.equals("")) {
                    arrayList.add("Name does not given length." + "\n");
                }
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                LocalDate minAge = LocalDate.of(2010, 1, 1);
                LocalDate currentAge = (LocalDate) fieldValue;
                if (currentAge.isAfter(minAge)) {
                    arrayList.add("Age hasn't reached adulthood age yet." + "\n");
                }
            } else if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                Integer currentValue = (Integer) fieldValue;
                if (currentValue < 0 || currentValue > 100) {
                    arrayList.add("Discount rate cannot be less than 0 or more than 100." + "\n");
                }
            } else if (field.isAnnotationPresent(Email.class)) {
                CharSequence currentEmail = (CharSequence) fieldValue;
                Pattern pattern = Pattern.compile(REGEX);
                Matcher matcher = pattern.matcher(currentEmail);
                if (!matcher.matches()) {
                    arrayList.add("Email is not valid" + "\n");
                }
            }
        }
        return arrayList;
    }

}
