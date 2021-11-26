package validation;

import validation.dto.CustomerDto;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) throws IllegalAccessException {

        LocalDate birthdate = LocalDate.of(2000,2,11);
        CustomerDto customerDto = new CustomerDto("test","fortest@gmail.com",birthdate,80);
        System.out.println(Validator.validate(customerDto));
    }
}
