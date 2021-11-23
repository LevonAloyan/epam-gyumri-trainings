package Annotations;


import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[]args) throws IllegalAccessException{
        CustomerDto customerDto = new CustomerDto("D",
                "balabekyandavo@gmail.com",
                LocalDate.of(2006,4,22),
                102);
        //customerDto.setBirthdate(LocalDate.of(2006,4,22));
        //customerDto.setName("D");

        AnnotationProcessor annotationProcessor = new LengthProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new EmailProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor  = new AdulthoodProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor = new MinProcessor();
        annotationProcessor.process(customerDto);

        annotationProcessor  = new MaxProcessor();
        annotationProcessor.process(customerDto);

    }
}
