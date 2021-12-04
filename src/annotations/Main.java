package annotations;

import java.time.LocalDate;

public class Main<T> {


    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("G", "gtepanosyan@gmail.com", LocalDate.of(2007, 01, 06), -5);
        getChainOfProcessors().process(customerDto);
//       AnnotationProcess processors = new AdulthoodAnnotationProcess<LocalDate>();
//        processors.process(customerDto);
//
//        processors = new LengthAnnotationProcess<String>();
//        processors.process(customerDto);
//
//         processors = new EmailAnnotationProcess<String>();
//        processors.process(customerDto);
//
//         processors = new MaxAnnotationProcess<Integer>();
//        processors.process(customerDto);
//
//         processors = new MinAnnotationProcess<Integer>();
//        processors.process(customerDto);
    }

    public static <T> AnnotationProcess<T> getChainOfProcessors() {
        AnnotationProcess<T> lengthProcessor = new LengthAnnotationProcess<>();
        AnnotationProcess<T> emailProcessor = new EmailAnnotationProcess<>();
        AnnotationProcess<T> adultProcessor = new AdulthoodAnnotationProcess<>();
        AnnotationProcess<T> minProcessor = new MinAnnotationProcess<>();
        AnnotationProcess<T> maxProcessor = new MaxAnnotationProcess<>();

        lengthProcessor.setNextProcessor(emailProcessor);
        emailProcessor.setNextProcessor(adultProcessor);
        adultProcessor.setNextProcessor(minProcessor);
        minProcessor.setNextProcessor(maxProcessor);
        return lengthProcessor;
    }
}
