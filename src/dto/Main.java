package dto;

import dto.dtoValidator.Validator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("A");
        customerDto.setEmail("Aaaaaa.com");
        customerDto.setBirthDay(LocalDate.of(2005,7,7));
        customerDto.setDiscountRate(103);

        System.out.println(Validator.validate(customerDto));

    }

}
