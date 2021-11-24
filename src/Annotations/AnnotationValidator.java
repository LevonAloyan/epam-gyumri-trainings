package Annotations;


import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[] args) throws IllegalAccessException, ValidatorException {
        CustomerDto customerDto = new CustomerDto("D",
                "balabekyandavo@gmail.com", LocalDate.of(2001, 11, 12),
                102);

        AnnotationProcessor annotationProcessor = new LengthProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new EmailProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new AdulthoodProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new MinProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new MaxProcessor();
        annotationProcessor.process(customerDto);

    }
}
