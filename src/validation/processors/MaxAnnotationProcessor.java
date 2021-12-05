package validation.processors;

import validation.annotations.Max;

import java.lang.reflect.Field;

import  validation.exception.ValidatorExceptions;

public class MaxAnnotationProcessor<T> extends AnnotationProcessor <T> {
    public  String  validate (T dto) throws IllegalAccessException  {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String  errors = null;

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Max.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    int fieldValue = (int) o;
                    Max annotation = field.getAnnotation(Max.class);

                    if (fieldValue > annotation.value()){
                        errors = "length less than  " +  annotation.value();
                        System.err.println(errors);
                    }
                } else {
                    throw new  ValidatorExceptions ( "Max annotation is not applicable on none Integer fields.");

                }
                getNextProcessor().validate(dto);
            }
        }

        return errors;
    }
}
