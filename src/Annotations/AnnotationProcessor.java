package Annotations;

public interface AnnotationProcessor<T> {
    void process(T object) throws IllegalAccessException;
}
