package annotationDTO;


public abstract class ValidationProcessor<V> {

    private ValidationProcessor<V> nextProcessor;

    public abstract  <T> void process(T object);

    public ValidationProcessor<V> getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(ValidationProcessor<V> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}