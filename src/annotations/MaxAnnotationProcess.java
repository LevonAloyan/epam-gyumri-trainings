package annotations;

import java.lang.reflect.Field;

public class MaxAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object) throws IllegalAccessException, ValidatorExceptions {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Object obj = field.get(object);

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
