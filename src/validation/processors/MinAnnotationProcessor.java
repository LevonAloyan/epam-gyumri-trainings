package validation.processors;

import validation.annotations.Min;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public  String  validateMin(Object dto) throws IllegalAccessException  {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String  errors = null;

        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Min.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer) {
                    int fieldValue = (int) o;
                    Min annotation = field.getAnnotation(Min.class);

                    if (fieldValue < annotation.value()){
                        errors = "length less than  " +  annotation.value();
                        System.out.println("min  " + annotation.value());
                    }
                } else {
                    errors = "Min annotation is not applicable on none Integer fields.";

                }
            }
        }

        return errors;
    }
}
