package validation;

import java.time.LocalDate;
import java.util.Arrays;


import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        Validator<CustomerDto> validator = new Validator<CustomerDto>();

        CustomerDto customerDto = new CustomerDto("Nume", "email@gmail.com", LocalDate.of(2011,11,11), 101);

        String[] validate = validator.validate(customerDto);
        System.out.println(Arrays.toString(validate));

    }
}
