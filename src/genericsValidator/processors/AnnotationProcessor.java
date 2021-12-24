package genericsValidator.processors;

import genericsValidator.exceptions.ValidationException;

public abstract class AnnotationProcessor <V> {

     private AnnotationProcessor<V> nextProcessor;

    public abstract String[] validate(V dto) throws IllegalArgumentException, ValidationException;

     public AnnotationProcessor<V> getNextProcessor() {
          return nextProcessor;
     }

     public void setNextProcessor(AnnotationProcessor<V> nextProcessor) {
          this.nextProcessor = nextProcessor;
     }
}
