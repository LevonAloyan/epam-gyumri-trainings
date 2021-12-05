package validation.processors;

public abstract class AnnotationProcessor <T> {

  private AnnotationProcessor <T> nextProcessor;  
    
public abstract String   validate (T dto) throws IllegalAccessException;

public AnnotationProcessor<T> getNextProcessor() {
    return nextProcessor;
}
public void setNexProcessor(AnnotationProcessor<T> nextProcessor) {
    this.nextProcessor = nextProcessor;
}

}
