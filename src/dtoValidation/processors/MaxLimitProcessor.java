package dtoValidation.processors;

import dtoValidation.annotations.Max;
import java.lang.reflect.Field;

public class MaxLimitProcessor<T> extends AnnotationProcessor<T> {

    public MaxLimitProcessor() {
    }

    public MaxLimitProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public String validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                if ((Integer) field.get(t) > field.getAnnotation(Max.class).value()) {
                    return "Value can't be more then " + field.getAnnotation(Max.class).value();
                }
            }
        }
        return nextProcessor == null ? null : nextProcessor.validate(t);
    }

}
