package validation;

import java.time.LocalDate;
import java.util.Arrays;


import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();

        CustomerDto customerDto = new CustomerDto("ssnh", "Samvel@gmail.com", LocalDate.of(1992,12,26), 15);

        String[] validate = validator.validate(customerDto);
        System.out.println(Arrays.toString(validate));

    }
}
