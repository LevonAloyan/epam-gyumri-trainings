package annotation;

import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer();
        customer.setBirthday(LocalDate.of(1994,3,21));
        customer.setEmail("atanesyangug@gmail.com");
        customer.setName("Gug");
        customer.setDiscountRate(102);



        AnnotationInterface processor = new AdulthoodAnnotationProcessor <LocalDate>();
        processor.process(customer);

        processor = new LengthAnnotationProcessor <String>();
        processor.process(customer);


        processor = new MinAnnotationProcessor<Integer>();
        processor.process(customer);

        processor  = new MaxAnnotationProcessor<Integer>();
        processor.process(customer);

        processor  = new EmailAnnotationProcessor <String>();
        processor.process(customer);

    }
}
