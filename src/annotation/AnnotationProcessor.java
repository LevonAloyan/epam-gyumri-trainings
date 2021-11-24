package annotation;

 interface AnnotationProcessor {
     String[] validate(Object o) throws IllegalArgumentException;
}
