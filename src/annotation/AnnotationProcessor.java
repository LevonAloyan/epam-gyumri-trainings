package annotation;

abstract interface AnnotationProcessor <V> {
     String[] validate(V dto) throws IllegalArgumentException, ValidationException;
}
