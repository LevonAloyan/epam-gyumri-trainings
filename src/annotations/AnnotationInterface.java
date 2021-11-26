package annotations;

import java.util.List;

public interface AnnotationInterface<T> {
    void process(T object) throws IllegalAccessException, ValidatorExceptions;

}