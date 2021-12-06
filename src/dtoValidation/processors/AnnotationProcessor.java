package dtoValidation.processors;

public abstract class AnnotationProcessor <T>{

    protected AnnotationProcessor<T> nextProcessor;

    public abstract String validate(T t) throws IllegalAccessException;

}
