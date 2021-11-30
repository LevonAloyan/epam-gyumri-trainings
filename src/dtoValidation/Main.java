package dtoValidation;

import dtoValidation.validator.Validator;
import dtoValidation.dto.CustomerDto;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("AAA");
        customerDto.setEmail("Aa@a.com");
        customerDto.setBirthDay(LocalDate.of(1995, 7, 7));
        customerDto.setDiscountRate(17);
        Validator<CustomerDto> validator = new Validator<>();
        System.out.println(validator.validate(customerDto));
    }

}


