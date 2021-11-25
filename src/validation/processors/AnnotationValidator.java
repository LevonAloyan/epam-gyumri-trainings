package validation.processors;

public interface AnnotationValidator {

    String[] validate(Object dto) throws IllegalAccessException, NewCustomException;
}
