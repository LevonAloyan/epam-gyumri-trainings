package validation;

import validation.processors.*;

public class ChainOfProcessor <T>{
    public static <T> AnnotationProcessor<T> getChainOfProcessors(){
        AnnotationProcessor<T> adulthoodAnnotationProcessor=new AdulthoodAnnotationProcessor<>();
        AnnotationProcessor<T> emailAnnotationProcessor=new EmailAnnotationProcessor<>();
        AnnotationProcessor<T> lengthAnnotationProcessor=new LengthAnnotationProcessor<>();
        AnnotationProcessor<T> maxAnnotationProcessor=new MaxAnnotationProcessor<>();
        AnnotationProcessor<T> minAnnotationProcessor=new MinAnnotationProcessor<>();
        adulthoodAnnotationProcessor.setAnnotationProcessor(emailAnnotationProcessor);
        emailAnnotationProcessor.setAnnotationProcessor(lengthAnnotationProcessor);
        lengthAnnotationProcessor.setAnnotationProcessor(maxAnnotationProcessor);
        maxAnnotationProcessor.setAnnotationProcessor(minAnnotationProcessor);
return adulthoodAnnotationProcessor;
    }
}
