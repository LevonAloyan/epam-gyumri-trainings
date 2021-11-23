package annotations;

import java.lang.reflect.Field;

public class MaxAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object)  {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Max annotation = field.getAnnotation(Max.class);
                CustomerDto customerDto = (CustomerDto) object;
                int fieldValue = customerDto.getDiscountRate();
                int valuesMax = annotation.max();
                if(fieldValue > valuesMax){
                    System.out.println("This discount does not exist is very large");
                }
            }
        }
    }
}
