package validaton;

import validaton.processor.*;

public class ChainOfResponsible {

    public  static <T> AbstractValidation<T> getInstance() {
        AbstractValidation<T> processor = new LengthAnnotationProcessor<>();
        EmailAnnotationProcessor<T> emailProcessor = new EmailAnnotationProcessor<>();

        AdulthoodAnnotationProcessor<T> adulthoodProcessor = new AdulthoodAnnotationProcessor<>();
        MinAnnotationProcessor<T> minProcessor = new MinAnnotationProcessor<>();
        MixAnnotationProcessor<T> maxProcessor = new MixAnnotationProcessor<>();
        processor.setNext(emailProcessor);
        emailProcessor.setNext(adulthoodProcessor);
        adulthoodProcessor.setNext(minProcessor);
        minProcessor.setNext(maxProcessor);
        return processor;
    }
}
