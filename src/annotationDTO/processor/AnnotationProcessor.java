package annotationDTO.processor;


public abstract class AnnotationProcessor<T> {
    private AnnotationProcessor<T> nextProcessor;

    public abstract String validate (T dto) throws IllegalAccessException;

    public void setNextProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public AnnotationProcessor<T> getNextProcessor() {
        return nextProcessor;
    }
}