package validaton.processor;

import validaton.AbstractValidation;
import validaton.annotation.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class AdulthoodAnnotationProcessor<T>  extends AbstractValidation<T> {



    @Override
    public Set<String> validate(T dto) throws IllegalAccessException {
        Set<String> errors = new HashSet<>();
        String error = validateAdulthood(dto);
        if(error != null){
            errors.add(error);
        }
        if (next !=null){
            errors.addAll(next.validate(dto));
        }
        return errors;
    }

    public String validateAdulthood(T dto) throws IllegalAccessException {
        Field[] declaredField = dto.getClass().getDeclaredFields();
        String error = null;
        for (Field field:declaredField) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof LocalDate) {
                    LocalDate date = (LocalDate) o;
                    LocalDate nowDate = LocalDate.now();
                    int year = nowDate.getYear() - date.getYear();
                    int day = nowDate.getDayOfYear() - date.getDayOfYear();

                    if (year < 18 || (year == 18 || day < 0)) {
                        error = "you don't Adulthood";
                    }
                } else {
                    error = "Adulthood annotation is not applicable on none LocalDate fields.";

                }

            }
        }
        return  error;
    }

}
