package Annotations;


import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("D",
                "balabekyandavo@gmail.com", LocalDate.of(2004, 11, 12),
                102);

        AnnotationProcessor annotationProcessor = new LengthProcessor<String>();
        annotationProcessor.process(customerDto);

        annotationProcessor = new EmailProcessor<String>();
        annotationProcessor.process(customerDto);

        annotationProcessor = new AdulthoodProcessor<LocalDate>();
        annotationProcessor.process(customerDto);

        annotationProcessor = new MinProcessor<Integer>();
        annotationProcessor.process(customerDto);

        annotationProcessor = new MaxProcessor<Integer>();
        annotationProcessor.process(customerDto);

    }
}
