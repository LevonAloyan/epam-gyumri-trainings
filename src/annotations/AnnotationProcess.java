package annotations;

public abstract class AnnotationProcess<T> {
    private AnnotationProcess<T> nextProcessor;

   public abstract void process(T object) throws IllegalAccessException, ValidatorExceptions;

    public AnnotationProcess<T> getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(AnnotationProcess<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}