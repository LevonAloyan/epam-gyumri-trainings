package validation.processors;

import validation.annotations.Max;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public String[] maxValidation(Object dto) throws IllegalAccessException {

        String[] errors = null;

        Field[] fields = dto.getClass().getDeclaredFields();

        for (Field field : fields){
            if (field.isAnnotationPresent(Max.class)){
                field.setAccessible(true);
                Object o = field.get(dto);
                if (o instanceof Integer){
                    int fieldValue = (int) o;
                    Max annotation = field.getAnnotation(Max.class);
                    if (fieldValue > annotation.max()){
                        errors = new String[1];
                        errors[0] = "Field value is more than should be";
                    }else {
                        errors = new String[1];
                        errors[0] = "No maxValue error found";
                    }
                }
            }
        }


        return errors;

    }


}
