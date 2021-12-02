package validation.processors;
import validation.annotation.Adulthood;
import validation.dto.CustomerDto;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public  String [] validateAdulthood(Object dto) throws IllegalAccessException {
        String [] errorMessage = new String[10];
        Class<?> ourClass = dto.getClass();
        Field[] declaredField = ourClass.getDeclaredFields();

        for (Field field : declaredField) {
            if(field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                CustomerDto customer = (CustomerDto) dto;
                LocalDate birthDate = (LocalDate) field.get(dto);
                int years = Period.between(birthDate, LocalDate.now()).getYears();
                if (years < 18){
                    errorMessage[0] = field.getName()+ "Field has an error, the user isn't an adult. User age is " + years;
                    System.err.println(errorMessage[0]);
                }
            }
        }

        return errorMessage;
            }
        }
