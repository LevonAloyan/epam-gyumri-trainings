package dtoValidation.processors;

public interface AnnotationProcessor <T>{

    String validate(T t) throws IllegalAccessException;

}
