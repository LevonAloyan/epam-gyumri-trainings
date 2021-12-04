package validation.processors;

public abstract class AnnotationProcessor <T>{
    private AnnotationProcessor<T> annotationProcessor;

    public AnnotationProcessor<T> getNextProcessor() {
        return annotationProcessor;
    }

    public void setAnnotationProcessor(AnnotationProcessor<T> annotationProcessor) {
        this.annotationProcessor = annotationProcessor;
    }

   public abstract String[] validate(T name) throws IllegalAccessException ;
}
