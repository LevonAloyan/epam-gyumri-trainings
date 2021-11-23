package annotations;

import java.lang.reflect.Field;

public class LengthAnnotationProcess implements AnnotationInterface {

    @Override
    public void process(Object object)  {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                //todo get Annotation arguments
                Length annotation = field.getAnnotation(Length.class);
                CustomerDto customerDto = (CustomerDto) object;
                String fieldValue = customerDto.getName();
                if (fieldValue.length() < annotation.min() || fieldValue.length() > annotation.max()) {
                    System.out.println("Your name is misspelled, please correct it");
                } else {
                    System.out.println(customerDto.getName());
                }
            }
        }
    }
}
