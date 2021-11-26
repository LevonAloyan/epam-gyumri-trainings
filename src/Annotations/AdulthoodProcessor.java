package Annotations;

//import algorithms.Adulthood;
//import algorithms.AnnotationProcessor;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;


public class AdulthoodProcessor<T> implements AnnotationProcessor<T> {

    @Override
    public void process(T object) throws IllegalAccessException {

        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Object obj1 = field.get(object);
                if (obj1 instanceof LocalDate) {
                    LocalDate birthDate = (LocalDate) obj1;
                    int years = Period.between(birthDate, LocalDate.now()).getYears();
                    if (years < 18) {
                        System.out.println("Yor aren't allowed to login");
                    }
                } else throw new ValidatorException("Type must be LocalDate");
            }
        }
    }
}

