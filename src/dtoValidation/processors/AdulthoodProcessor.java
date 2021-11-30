package dtoValidation.processors;

import dtoValidation.annotations.Adulthood;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodProcessor<T> implements AnnotationProcessor<T> {

    AnnotationProcessor<T> nextProcessor;

    public AdulthoodProcessor() {
    }

    public AdulthoodProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public String validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                LocalDate birthday = (LocalDate) field.get(t);
                LocalDate dateNow = LocalDate.now();
                int year = birthday.getYear();
                int yearNow = dateNow.getYear();
                int age = yearNow - year;
                if (age < 18) {
                    return "Age must be more then 18";
                }
            }
        }
        return nextProcessor == null ? null : nextProcessor.validate(t);
    }

}
