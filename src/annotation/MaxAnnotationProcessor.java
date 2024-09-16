package annotation;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor <T>  extends AnnotationProcessor<T> {


    public String[] validate (T t) throws IllegalAccessException {
        String[]errorMessages=new String[5];
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Object maxDiscount = field.get(t);
                if (maxDiscount instanceof Number) {
                    Number number = (Number) maxDiscount;
                    Min annotation = field.getAnnotation(Min.class);
                    int valueMin = annotation.value();
                    if (number.intValue() > valueMin) {
                        System.out.println("It has to be less 100");
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
