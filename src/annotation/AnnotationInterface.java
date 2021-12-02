package annotation;

public interface AnnotationInterface<T> {

     void process(T t) throws IllegalAccessException;
}
