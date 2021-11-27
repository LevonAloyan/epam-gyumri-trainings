package dtoValidation;

import dtoValidation.dto.CustomerDto;
import dtoValidation.error.Error;
import dtoValidation.validator.Validator;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("A");
        customerDto.setEmail("Aaaaaa.com");
        customerDto.setBirthDay(LocalDate.of(2005, 7, 7));
        customerDto.setDiscountRate(103);
        Validator<CustomerDto> validator = new Validator<>();
        List<Error> errors = validator.validate(customerDto);
        System.out.println(errors);
    }

}
