package algorithms;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodValidator {

    public String [] validate(Object object) throws IllegalAccessException {
        String [] errorMessages = new String[5];

      Class<?> aClass = object.getClass();
      Field[] declaredFields = aClass.getDeclaredFields();
      for(Field field: declaredFields){
          if(field.isAnnotationPresent(Adulthood.class)){
              field.setAccessible(true);
              LocalDate birthDay = (LocalDate) field.get(object);
              LocalDate now = LocalDate.now();
              int years = Period.between(birthDay,LocalDate.now()).getYears();
              if(years < 18){
                  System.out.println("You are not allowed to sing in");
              }


          }
      }


        return errorMessages;
    }
}
