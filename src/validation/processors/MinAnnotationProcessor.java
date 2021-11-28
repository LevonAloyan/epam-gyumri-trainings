package validation.processors;


import validation.annotations.Min;

import java.lang.reflect.Field;


public class MinAnnotationProcessor {

    public static Class<?> validateMin(Object dto) throws IllegalAccessException, NoSuchFieldException {
        Class<?> mClass = dto.getClass();
        Field[] declaredField = mClass.getDeclaredFields();
        for (Field fieldName : declaredField) {
            Min annotation = fieldName.getAnnotation(Min.class);
            Field field = dto.getClass().getDeclaredField(fieldName.getName());
            field.setAccessible(true);
            int value1 = (int) field.get(dto);
            if (value1 == annotation.valueMin()) {
                System.err.println("In" + mClass + "in "
                        + fieldName + " value" + value1 + "is min.");
            }

        }

        return mClass;
    }
}
