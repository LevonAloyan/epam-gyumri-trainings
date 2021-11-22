package annotation;

import java.time.LocalDate;

public class AnnotationTest {
    public static void main(String[] args)  throws IllegalArgumentException {
        LocalDate localDate = LocalDate.of(1444,4,17);
        Customer customer = new Customer(null, null, localDate, 0);
        customer.setName("rgrd");
        customer.setEmail("grer7yy");
    }
}
