package dtoValidation.processors;

import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

public interface AnnotationProcessor {
    Error validate(Dto dto) throws IllegalAccessException;
}
