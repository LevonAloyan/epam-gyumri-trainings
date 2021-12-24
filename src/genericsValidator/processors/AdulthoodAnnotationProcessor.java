package genericsValidator.processors;

import genericsValidator.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor<V> extends AnnotationProcessor<V> {
    @Override
    public String [] validate (V dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Adulthood.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    if (o instanceof LocalDate) {
                        LocalDate fieldValue = (LocalDate) o;
                        Adulthood annotation = field.getAnnotation(Adulthood.class);
                        LocalDate birthday = LocalDate.of(fieldValue.getYear(), fieldValue.getMonth(), fieldValue.getDayOfMonth());
                        Period period = Period.between(birthday, LocalDate.now());

                        if (period.getYears() < 18) {
                            errors = new String[1];
                            errors[0] = annotation.message();
                        }
//                        getNextProcessor().validate(dto);
                    }
                }
            }
        }catch (Exception exc ){
            errors = new String[0];
        }
        return errors;
    }
}
