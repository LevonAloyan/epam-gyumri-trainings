package dtoValidation.processors;

import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

public interface AnnotationProcessor<T> {
    Error validate(T t) throws IllegalAccessException;
}
