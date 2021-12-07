package annotationDTO;

import annotationDTO.processor.*;

public class ChainOfProcessors {

    public static <T> ValidationProcessor<T> chainOfProcessors () {

        ValidationProcessor<T> lengthProcessor = new LengthProcess<>();
        ValidationProcessor<T> adulthoodProcessor = new AdultValidProcess<>();
        ValidationProcessor<T> emailProcessor = new EmailProcess<>();
        ValidationProcessor<T> minProcessor = new MinProcess<>();
        ValidationProcessor<T> maxProcessor = new MaxProcess<>();

        lengthProcessor.setNextProcessor(adulthoodProcessor);
        adulthoodProcessor.setNextProcessor(emailProcessor);
        emailProcessor.setNextProcessor(minProcessor);
        minProcessor.setNextProcessor(maxProcessor);

        return lengthProcessor;
    }
}