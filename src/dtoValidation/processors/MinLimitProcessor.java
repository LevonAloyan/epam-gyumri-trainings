package dtoValidation.processors;

import dtoValidation.annotations.Min;
import java.lang.reflect.Field;

public class MinLimitProcessor<T> extends AnnotationProcessor<T> {

    public MinLimitProcessor() {
    }

    public MinLimitProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public String validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(t) < field.getAnnotation(Min.class).value()) {
                    return "Value can't be less then " + field.getAnnotation(Min.class).value();
                }
            }
        }
        return nextProcessor == null ? null : nextProcessor.validate(t);
    }

}

