package annotation;

import java.lang.reflect.Field;

public class MinAnnotationProcessor<T> extends AnnotationProcessor<T> {


    public String[] validate(T t) throws IllegalAccessException {
        String[] errorMessages = new String[5];
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Object minDiscount = field.get(t);
                if (minDiscount instanceof Number) {


                    Number number = (Number) minDiscount;
                    Min annotation = field.getAnnotation(Min.class);
                    int valueMax = annotation.value();

                    if (number.intValue() > valueMax) {
                        System.out.println("It has to be more 0");
                    } else {
                        throw new ValidatorException();
                    }


                } if(getNextProcessor()!=null){
                getNextProcessor().validate(t);}
            }
        }
        return errorMessages;
    }
}

