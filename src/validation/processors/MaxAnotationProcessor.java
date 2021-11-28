package validation.processors;



import validation.annotations.Max;
import validation.annotations.Min;

import java.lang.reflect.Field;



public class MaxAnotationProcessor {

    public static Class<?> validateMax(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> mClass = dto.getClass();
        Field[] declaredField = mClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            Max annotation = fieldName.getAnnotation(Max.class);
            Field field = dto.getClass().getDeclaredField(fieldName.getName());
            field.setAccessible(true);
            int value1 = (int) field.get(dto);
            if (value1 == annotation.valueMax()) {
                System.err.println("In" + mClass + "in "
                        + fieldName + " value" + value1 + "is min.");
            }

        }

        return mClass;
    }

}



