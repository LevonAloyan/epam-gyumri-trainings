package validation.processors;

import validation.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {


    public String[] AdulthoodValidation(Object dto) throws IllegalAccessException {
        LocalDate localDate = LocalDate.now();
        String[] errors = null;
        Field[] fields = dto.getClass().getDeclaredFields();

        for (Field field : fields){
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof LocalDate){
                    LocalDate fieldValue = (LocalDate) o;
                    Period period = Period.between(fieldValue, localDate);
                    if (period.getYears() < 18){
                        errors = new String[1];
                        errors[0] = "You are not 18";
                    }else {
                        errors = new String[1];
                        errors[0] = "Everything is okay";
                    }

                }


            }
        }

        return errors;
    }
}
