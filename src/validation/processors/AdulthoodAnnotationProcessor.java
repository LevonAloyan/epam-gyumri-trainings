package validation.processors;

import java.lang.reflect.Field;
import java.time.LocalDate;

import validation.annotations.Adulthood;

import  validation.exception.ValidatorExceptions;



public class AdulthoodAnnotationProcessor <T> extends AnnotationProcessor <T>  {

    public  String   validate(T dto) throws IllegalAccessException  {

        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String errors = null;
 
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof LocalDate) {

                    LocalDate dateBD = (LocalDate) o;
                    LocalDate today = LocalDate.now();

                    if (today.getYear() - dateBD.getYear() < 18 ) {
                        errors = "You no adulthood";
                        System.err.println(errors);
                    }
                
                } else {
                    throw new ValidatorExceptions ("Adulthood annotation is not applicable on none LocalDate fields.");
                }
                getNextProcessor().validate(dto);
            }
        }

        return errors;
    }

   
}
