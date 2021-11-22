package homework.dtoValidation;

import homework.dtoValidation.dto.CustomerDto;
import homework.dtoValidation.validator.Validator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto=new CustomerDto("Anun","anun@gmail.com", LocalDate.of(2021,10,20),500);
        Validator validator = new Validator();
        String errorMessage = validator.validate(customerDto);
        System.out.println(errorMessage);
    }
}
