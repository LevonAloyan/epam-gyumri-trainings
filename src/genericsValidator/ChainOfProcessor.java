package genericsValidator;

import genericsValidator.processors.*;

public class ChainOfProcessor<V> {
    public static <V> AnnotationProcessor<V> getChainOfProcessors(){
        AnnotationProcessor<V> adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor<>();
        AnnotationProcessor<V> emailAnnotationProcessor = new EmailAnnotationProcessor<>();
        AnnotationProcessor<V> lengthAnnotationProcessor = new LengthAnnotationProcessor<>();
        AnnotationProcessor<V> maxAnnotationProcessor = new MaxAnnotationProcessor<>();
        AnnotationProcessor<V> minAnnotationProcessor = new MinAnnotationProcessor<>();

        adulthoodAnnotationProcessor.setNextProcessor(emailAnnotationProcessor);
        emailAnnotationProcessor.setNextProcessor(lengthAnnotationProcessor);
        lengthAnnotationProcessor.setNextProcessor(maxAnnotationProcessor);
        maxAnnotationProcessor.setNextProcessor(minAnnotationProcessor);

        return adulthoodAnnotationProcessor;
    }
}
