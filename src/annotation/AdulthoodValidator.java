package annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodValidator<T> extends AnnotationProcessor<T> {

    @Override
    public String[] validate(T t) throws IllegalAccessException {
        String[] errorMessages = new String[5];
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                LocalDate birthDate = (LocalDate) field.get(t);
                int years = Period.between(birthDate, LocalDate.now()).getYears();
                if (years < 18) {
                    System.out.println("You are not allowed to login");
                }
                if(getNextProcessor()!=null){
                getNextProcessor().validate(t);}
            }
        }
        return errorMessages;
    }

}
