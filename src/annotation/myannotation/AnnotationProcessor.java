package annotation.myannotation;

import annotation.exception.ExpectedTypeException;

public interface AnnotationProcessor<T> {

    void fieldValidation(T obj) throws IllegalAccessException, ExpectedTypeException;
}
