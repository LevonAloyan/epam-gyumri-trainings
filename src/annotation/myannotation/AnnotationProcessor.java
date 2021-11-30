package annotation.myannotation;

import annotation.InvalidData;
import annotation.exception.ExpectedTypeException;

public interface AnnotationProcessor<T> {


    InvalidData fieldValidation(T obj) throws IllegalAccessException, ExpectedTypeException;
}
