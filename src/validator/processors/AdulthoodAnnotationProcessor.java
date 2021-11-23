package validator.processors;

import validator.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdulthoodAnnotationProcessor {

    public String[] validateAdulthood(Object dto, Field[] declaredFields) throws IllegalAccessException {
        String[] errors = null;
        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if(o instanceof LocalDate){
                    LocalDate fieldValue = (LocalDate) o;
                    LocalDate currentDate = LocalDate.now();

                    if (currentDate.getYear() - fieldValue.getYear() < 18){
                        errors = new String[1];
                        errors[0] = "The customer is not adult";
                    }
                }
            }
        }
        return errors;
    }
}
