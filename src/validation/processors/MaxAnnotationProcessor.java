package validation.processors;
import validation.annotation.Max;
import validation.dto.CustomerDto;
import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public String[] validateMax(Object object) {
        String[] errorMessage = new String[10];
        Class<?> ourClass = object.getClass();
        Field[] declaredField = ourClass.getDeclaredFields();

        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Max annotation = field.getAnnotation(Max.class);
                CustomerDto customer = (CustomerDto) object;
                int fieldValue = customer.getDiscountRate();
                int valueMax = annotation.maxValue();
                if (fieldValue > valueMax){
                    System.err.println("Length is max");
                }
            }
        }
        return errorMessage;
    }
}
