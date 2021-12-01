package validation.processors;

public interface AnnotationValidator <T> {

    String[] validate(T dto) throws IllegalAccessException, NewCustomException;
}
