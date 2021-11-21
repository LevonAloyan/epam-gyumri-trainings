package annotation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
//        LocalDate birthdate = LocalDate.of(2000,2,11);
//        CustomerDto customerDto = new CustomerDto("arrfdf","armenainclub@gmail.com",birthdate,17);
//        System.out.println(Validator.validate(customerDto));

        LocalDate birthdate = LocalDate.of(2012,2,11);
        CustomerDto customerDto = new CustomerDto("a","armenainclubgmail.com",birthdate,170);
        System.out.println(Validator.validate(customerDto));
    }
}
