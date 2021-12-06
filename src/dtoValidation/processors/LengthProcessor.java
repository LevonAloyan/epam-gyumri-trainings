package dtoValidation.processors;

import dtoValidation.annotations.Length;

import java.lang.reflect.Field;

public class LengthProcessor<T> extends AnnotationProcessor<T> {

    public LengthProcessor() {
    }

    public LengthProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public String validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String fieldName = field.get(t).toString();
                if (fieldName.length() < field.getAnnotation(Length.class).min()) {
                    return "Name must contain at least " + field.getAnnotation(Length.class).min() + " characters";
                } else if (fieldName.length() > field.getAnnotation(Length.class).max()) {
                    return "Name can't contain more then " + field.getAnnotation(Length.class).max() + " characters";
                }
            }
        }
        return nextProcessor == null ? null : nextProcessor.validate(t);
    }

}