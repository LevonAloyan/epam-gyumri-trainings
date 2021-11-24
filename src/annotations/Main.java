package annotations;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        LocalDate birthdate = LocalDate.of(2003,01,01);
        CustomerDto customerDto = new CustomerDto("A","argmail.com",birthdate,-1);
        System.out.println(Validator.validate(customerDto));

    }
}
