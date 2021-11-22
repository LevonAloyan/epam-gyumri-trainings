package validation;

import java.time.LocalDate;
import java.util.Arrays;

import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();

        CustomerDto customerDto = new CustomerDto("aaa", "a@email.com", LocalDate.now());

        String[] errors = validator.validate(customerDto);

        System.out.println(Arrays.toString(errors));

    }
}
