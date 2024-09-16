package annotation;

import javax.annotation.processing.Processor;

public class ChainOfProcessor<T> {
    public static <T> AnnotationProcessor<T> getChainOfProcessors() {
        AnnotationProcessor<T> adulthoodAnnotationProcessor = new AdulthoodValidator<T> ();
        AnnotationProcessor<T> emailAnnotationProcessor = new EmailValidator<T> ();
        AnnotationProcessor<T> maxAnnotationProcessor = new MaxAnnotationProcessor<> ();
        AnnotationProcessor<T> minAnnotationProcessor = new MinAnnotationProcessor<> ();
        AnnotationProcessor<T> lengthAnnotationProcessor = new LengthAnnotationProcessor<> ();

        adulthoodAnnotationProcessor.setNextProcessor(emailAnnotationProcessor);
        emailAnnotationProcessor.setNextProcessor(maxAnnotationProcessor);
        maxAnnotationProcessor.setNextProcessor(minAnnotationProcessor);
        minAnnotationProcessor.setNextProcessor(lengthAnnotationProcessor);

        return adulthoodAnnotationProcessor;
        }


    }
