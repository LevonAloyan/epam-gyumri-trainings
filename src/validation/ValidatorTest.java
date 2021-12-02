package validation;
import java.time.LocalDate;
import java.util.Arrays;

import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        CustomerDto customerDto = new CustomerDto("An", "aemail.com", LocalDate.of(2010,12,25));
        String[] validate = validator.validate(customerDto);
        System.out.println(Arrays.toString(validate));

    }
}