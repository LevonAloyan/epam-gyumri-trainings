package validaton.processor;

import validaton.annotation.Adulthood;
import validaton.dto.CostumerDto;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodAnnotationProcessor<T> {
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
