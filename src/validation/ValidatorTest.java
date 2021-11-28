package validation;

import java.time.LocalDate;
import java.util.Arrays;


import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Validator<CustomerDto> validator = new Validator();

        CustomerDto customerDto = new CustomerDto("aaa", "@jj",LocalDate.of(1993,12,01),9);
        String[] validate = validator.validate(customerDto);
        System.out.println(Arrays.toString(validate));

    }
}
