package genericValidator.processors;

import genericValidator.annotations.Adulthood;
import genericValidator.exceptions.NotMatchedTypeException;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodAnnotationProcessor<T> {

    public String[] validateAdulthood(T dto) throws IllegalAccessException {
        String[] errors = null;

        Field[] declaredFields = dto.getClass().getDeclaredFields();

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Adulthood.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if(o instanceof LocalDate){
                    LocalDate fieldValue = (LocalDate) o;
                    LocalDate currentDate = LocalDate.now();

                    if (currentDate.getYear() - fieldValue.getYear() < 18){
                        errors = new String[1];
                        errors[0] = "The customer is not adult";
                    }
                }else{
                    throw new NotMatchedTypeException("Type is not matched for the required annotation");
                }
            }
        }
        return errors;
    }
}
