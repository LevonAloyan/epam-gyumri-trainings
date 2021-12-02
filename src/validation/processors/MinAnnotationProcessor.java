package validation.processors;
import validation.annotation.Min;
import validation.dto.CustomerDto;
import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public String[] validateMin(Object object) {
        String[] errorMessage = new String[10];
        Class<?> ourClass = object.getClass();
        Field[] declaredField = ourClass.getDeclaredFields();

        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Min annotation = field.getAnnotation(Min.class);
                CustomerDto customer = (CustomerDto) object;
                int fieldValue = customer.getDiscountRate();
                int valueMax = annotation.minValue();
                if (fieldValue < valueMax){
                    System.err.println("Length is min");
                }
            }
        }
        return errorMessage;
    }
}
