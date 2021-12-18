package annotations;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorExceptions {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field:declaredFields) {
            if (field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                LocalDate birthDate = (LocalDate) field.get(object);
                Object obj = field.get(object);
                if (obj instanceof LocalDate) {
                    int years = Period.between(birthDate, LocalDate.now()).getYears();
                    if (years < 18) {
                        System.out.println("Your age does not match you can not log in");

                    }else {
                        System.out.println(birthDate);
                    }
                }else {
                    throw new ValidatorExceptions("Type must be Date");
                }
            }
        }
    }
}
