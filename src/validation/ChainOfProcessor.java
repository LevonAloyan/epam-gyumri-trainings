package validation;

import validation.processors.*;


public class ChainOfProcessor <T> {
    public static <T> AnnotationProcessor<T> getChainOfProcessors(){
        
        AnnotationProcessor<T> lengthAnnotationProcessor = new LengthAnnotationProcessor<>();
        AnnotationProcessor<T> emailAnnotationProcessor = new EmailAnnotationProcessor<>();
        AnnotationProcessor<T> adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor<>();
        AnnotationProcessor<T> minAnnotationProcessor = new MinAnnotationProcessor<>();
        AnnotationProcessor<T> maxAnnotationProcessor = new MaxAnnotationProcessor<>();
        lengthAnnotationProcessor.setNexProcessor(emailAnnotationProcessor);
        emailAnnotationProcessor.setNexProcessor(adulthoodAnnotationProcessor);
        adulthoodAnnotationProcessor.setNexProcessor(minAnnotationProcessor);
        minAnnotationProcessor.setNexProcessor(maxAnnotationProcessor);

        return lengthAnnotationProcessor;

    }
}
