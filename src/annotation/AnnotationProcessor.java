package annotation;

public abstract class AnnotationProcessor<T> {
    private AnnotationProcessor<T> nextProcessor;

    public abstract String[] validate(T t) throws IllegalAccessException;


    public AnnotationProcessor<T> getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
