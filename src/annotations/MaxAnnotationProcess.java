package annotations;

import java.lang.reflect.Field;

public class MaxAnnotationProcess<T> implements AnnotationInterface<T> {

    @Override
    public void process(T object) throws IllegalAccessException{
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object obj =  field.get(object);
                Max annotation = field.getAnnotation(Max.class);
                if (obj instanceof Number){
                    Number number1 = (Number) obj;
                int valuesMax = annotation.max();
                if(number1.intValue() > valuesMax){

                    System.out.println("This discount does not exist is very large");
                }
            }else {
                    throw new ValidatorExceptions("Type must be Number");
                }
        }
        }
    }
}
