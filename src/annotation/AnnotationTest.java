package annotation;

import java.time.LocalDate;
import java.util.Arrays;

public class AnnotationTest {
    public static void main(String[] args) {
        Validate validate = new Validate();
        Customer customer = new Customer("a", "a@mail.com",
                LocalDate.of(1980, 3, 5),3);
        String[] errors = validate.validate(customer);
        System.out.println(Arrays.toString(errors));
    }
}
