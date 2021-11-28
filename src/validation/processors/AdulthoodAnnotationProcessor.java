package validation.processors;

import java.lang.reflect.Field;
import java.time.LocalDate;

import validation.annotations.Adulthood;


public class AdulthoodAnnotationProcessor {
    public  String [] validateAdulthood(Object dto) throws IllegalAccessException  {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String [] errors = null;

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof LocalDate) {

                    LocalDate dateBirDay = (LocalDate) o;
                    LocalDate today = LocalDate.now();

                    if (today.getYear() - dateBirDay.getYear() < 18 ) {
                        errors=new String[1];
                        errors[0] = "Age is small";
                    }

                } else {
                    errors=new String[1];
                    errors[0] = "Adulthood annotation is not applicable on none LocalDate fields.";
                }
            }
        }

        return errors;
    }
}
