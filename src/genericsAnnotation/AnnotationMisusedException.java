package genericsAnnotation;

public class AnnotationMisusedException extends RuntimeException {
    public AnnotationMisusedException(String message){
        super(message);
    }
    public AnnotationMisusedException(String message, Throwable cause){
        super(message, cause);
    }
}
