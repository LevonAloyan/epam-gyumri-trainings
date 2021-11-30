package annotation;

import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer();
        customer.setBirthday(LocalDate.of(1994,3,21));
        customer.setEmail("atanesyangug@gmail.com");
        customer.setName("Gug");
        customer.setDiscountRate(102);



        AnnotationInterface processor = new AdulthoodAnnotationProcessor();
        processor.process(customer);

        processor = new LengthAnnotationProcessor();
        processor.process(customer);


        processor = new MinAnnotation();
        processor.process(customer);

        processor  = new MaxAnnotation();
        processor.process(customer);

        processor  = new EmailAnnotationProcessor();
        processor.process(customer);

    }
}
