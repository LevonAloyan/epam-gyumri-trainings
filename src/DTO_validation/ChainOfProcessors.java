package DTO_validation;

import DTO_validation.processor.*;

public class ChainOfProcessors<T> {

    public static <T> AnnotationProcessor<T> getChainOfProcessors (){
        AnnotationProcessor <T> adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor<>();
        AnnotationProcessor <T> emailAnnotationProcessor = new EmailAnnotationProcessor<>();
        AnnotationProcessor <T> lengthAnnotationProcessor = new LengthAnnotationProcessor<>();
        AnnotationProcessor <T> maxAnnotationProcessor = new MaxAnnotationProcessor<>();
        AnnotationProcessor <T> minAnnotationProcessor = new MinAnnotationprocessor<>();

        lengthAnnotationProcessor.setNextProcessor(emailAnnotationProcessor);
        emailAnnotationProcessor.setNextProcessor(adulthoodAnnotationProcessor);
        adulthoodAnnotationProcessor.setNextProcessor(maxAnnotationProcessor);
        maxAnnotationProcessor.setNextProcessor(minAnnotationProcessor);

        return lengthAnnotationProcessor;
    }
}
