package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private void length(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Length myAnn = field.getAnnotation(Length.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            int maxLen = myAnn.max();
            int minLen = myAnn.min();
            if (maxLen >= fieldValue.length() && minLen <= fieldValue.length()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());
            }

        }


    }

    private void email(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();
        Pattern pattern = Pattern.compile(regex);

        for (Field field : fields) {
            Email myAnn = field.getAnnotation(Email.class);
            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            Matcher matcher = pattern.matcher(fieldValue);
            if (matcher.find()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());
            }
        }
    }

    private void adulthood(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = name.getClass().getDeclaredFields();
        //Birth date


        for (Field field : fields) {
            Adulthood myAnn = field.getAnnotation(Adulthood.class);

            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            LocalDate today = LocalDate.now();                          //Today's date
            LocalDate birthday = LocalDate.parse(fieldValue);
            Period p = Period.between(birthday, today);
            if (p.getYears() < 18) {
                System.out.println(myAnn.message());

            } else {
                System.out.println(fieldValue);
            }


        }
    }

    private void max(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Max myAnn = field.getAnnotation(Max.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue <= myAnn.max()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());
            }

        }
    }

    private void min(Object name) throws IllegalAccessException, NoSuchFieldException {

        Field[] fields = name.getClass().getDeclaredFields();

        for (Field field : fields) {

            Min myAnn = field.getAnnotation(Min.class);
            field.setAccessible(true);
            int fieldValue = (int) field.get(name);

            if (fieldValue >=myAnn.min()) {
                System.out.println(fieldValue);
            } else {
                System.out.println(myAnn.message());}
        }
    }

    public void errorListValidate(Object o) {
Class<?>  aClass=Validator.class;
        Method[] declaredMethods = aClass.getDeclaredMethods();

    }

}

