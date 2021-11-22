package annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AuthoodValidator {
    public void authood(Object name) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = name.getClass().getDeclaredFields();
        //Birth date


        for (Field field : fields) {
            Adulthood myAnn = field.getAnnotation(Adulthood.class);

            field.setAccessible(true);
            String fieldValue = (String) field.get(name);
            LocalDate today = LocalDate.now();                          //Today's date
            LocalDate birthday = LocalDate.parse(fieldValue);
            Period p = Period.between(birthday, today);
            if (p.getYears()<18){
                System.out.println(myAnn.message());

            }else {
                System.out.println(fieldValue);
            }


        }
    }
    }
