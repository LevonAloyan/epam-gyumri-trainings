package annotation;

import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer();
        customer.setBirthday(LocalDate.of(1994,3,21));
        customer.setEmail("atanesyangug@gmail.com");
        customer.setName("Gug");
        customer.setDiscountRate(102);



        AdulthoodAnnotationProcessor processor = new AdulthoodAnnotationProcessor();
        processor.checkMajority(customer);

        LengthAnnotationProcessor processor1 = new LengthAnnotationProcessor();
        processor1.checkLength(customer);


        MinAnnotation processor2 = new MinAnnotation();
        processor2.checkMin(customer);

        MaxAnnotation processor3 = new MaxAnnotation();
        processor3.checkMax(customer);

        EmailAnnotationProcessor processor4 = new EmailAnnotationProcessor();
        processor4.checkEmail(customer);

    }
}
