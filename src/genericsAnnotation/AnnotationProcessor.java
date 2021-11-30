package genericsAnnotation;

 interface AnnotationProcessor <V> {
     String[] validate(V dto) throws IllegalArgumentException, ValidationException;
}
