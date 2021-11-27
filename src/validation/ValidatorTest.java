package validation;

import java.time.LocalDate;
import java.util.Arrays;


import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();

        CustomerDto customerDto = new CustomerDto("Name", "email@gmail.com", LocalDate.of(2011,11,11), 11);

        String[] validate = validator.validate(customerDto);
        System.out.println(Arrays.toString(validate));

    }
}