package dtoannotations;

import dtoannotations.processors.*;

public class ChainOfProcessors {

    public static <T> ValidationProcessor<T> chainOfProcessors () {

        ValidationProcessor<T> lengthProcessor = new LengthValidationProcessor<>();
        ValidationProcessor<T> adulthoodProcessor = new AdulthoodValidationProcessor<>();
        ValidationProcessor<T> emailProcessor = new EmailValidationProcessor<>();
        ValidationProcessor<T> minProcessor = new MinValidationProcessor<>();
        ValidationProcessor<T> maxProcessor = new MaxValidationProcessor<>();

        lengthProcessor.setNextProcessor(adulthoodProcessor);
        adulthoodProcessor.setNextProcessor(emailProcessor);
        emailProcessor.setNextProcessor(minProcessor);
        minProcessor.setNextProcessor(maxProcessor);

        return lengthProcessor;
    }
}
