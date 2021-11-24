package annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor implements AnnotationProcessor {
    @Override
    public String [] validate(Object dto) throws IllegalArgumentException{
        Class<?> dtoClass = dto.getClass();
        Field[] fields = dtoClass.getDeclaredFields();
        String[] errors = null;
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Adulthood.class)) {
                    field.setAccessible(true);
                    Object o = field.get(dto);
                    if (o instanceof String) {
                        String fieldValue = (String) o;
                        Adulthood annotation = field.getAnnotation(Adulthood.class);
                        LocalDate today = LocalDate.now();
                        LocalDate birthday = LocalDate.of(0,0,0);
                        Period period = Period.between(birthday, today);

                        if (period.getYears() < 18) {
                            errors = new String[1];
                            errors[0] = annotation.message();
                        }
                    }
                }
            }
        }catch (Exception exc ){
            errors = new String[0];
        }
        return errors;
    }
}
