package validation.processors;

import validation.annotations.Max;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public  String [] validateMax (Object dto) throws IllegalAccessException  {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String []  errors = null;

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Max.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    int fieldValue = (int) o;
                    Max annotation = field.getAnnotation(Max.class);

                    if (fieldValue > annotation.value()){
                        errors = new String[1];
                        errors[0] = "length more little than  " +  annotation.value();
                    }
                } else {
                    errors = new String[1];
                    errors[0] = "Max annotation is not applicable on none Integer fields.";

                }
            }
        }

        return errors;
    }
}
