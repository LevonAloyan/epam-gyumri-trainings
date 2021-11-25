package validation.processors;

import validation.annotations.Max;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public String[] validateMax(Object dto) throws IllegalAccessException{
       Field[] declaredFields=dto.getClass().getDeclaredFields();
       String [] errors=null;
       for(Field field:declaredFields){
           if(field.isAnnotationPresent(Max.class)){
               field.setAccessible(true);
               Object o=field.get(dto);
               if(o instanceof Integer){
                   Integer fieldMax= (Integer) o;
                   Max annotation=field.getAnnotation(Max.class);
                   int value= annotation.value();
                   if (fieldMax>value){
                       errors= new String[1];
                       errors[0]= field.getName()+ "discount must be smaller ";
                   }

               }
           }
       }
       return  errors;
    }
}
