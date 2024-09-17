package Annotations;

public abstract class AnnotationProcessor<T> {

    private AnnotationProcessor<T>nextProcessor;

    public abstract void process(T object) throws IllegalAccessException, ValidatorException;

    public AnnotationProcessor<T> getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
