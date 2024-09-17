package validation.processors;

public abstract class AnnotationProcessor<T> {
    private AnnotationProcessor<T> nextProcessor;

    public abstract String[] validate(T object) throws IllegalAccessException, NewCustomException;


    public AnnotationProcessor<T> getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
