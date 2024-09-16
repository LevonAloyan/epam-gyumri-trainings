package annotation;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor<T> extends AnnotationProcessor<T> {


    public String[] validate (T t) throws IllegalAccessException {
        String[]errorMessages=new String[1];
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object lengthSize = field.get(t);
                if (lengthSize instanceof String) {
                    String name = (String) lengthSize;
                    Length annotation = field.getAnnotation(Length.class);

                    if (name.length() > annotation.min() || name.length() < annotation.max()) {
                        System.out.println("You cannot allowed");
                    }
                }else{
                    throw new ValidatorException();
                }
            }
            if (getNextProcessor()!=null){
                getNextProcessor().validate(t);
            }
        }
        return errorMessages;
    }
}