package Annotations;


import java.time.LocalDate;

public class ChainOfProcessors {

    public static void main(String[] args) throws IllegalAccessException, ValidatorException {
        CustomerDto customerDto = new CustomerDto("D",
                "balabekyandavogmailcom", LocalDate.of(2007, 11, 12),
                102);
        getChainOfProcessors().process(customerDto);
    }

    public static <T> AnnotationProcessor<T> getChainOfProcessors() {

        AnnotationProcessor<T> lengthProcessor = new LengthProcessor<>();
        AnnotationProcessor<T> emailProcessor = new EmailProcessor<>();
        AnnotationProcessor<T> adulthoodProcessor = new AdulthoodProcessor<>();
        AnnotationProcessor<T> minProcessor = new MinProcessor<>();
        AnnotationProcessor<T> maxProcessor = new MaxProcessor<>();

        lengthProcessor.setNextProcessor(emailProcessor);
        emailProcessor.setNextProcessor(adulthoodProcessor);
        adulthoodProcessor.setNextProcessor(minProcessor);
        minProcessor.setNextProcessor(maxProcessor);

        return lengthProcessor;
    }
}
