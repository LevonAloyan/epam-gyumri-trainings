package annotations;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        LocalDate birthdate = LocalDate.of(2008,01,01);
        CustomerDto customerDto = new CustomerDto("a","argmail.com",birthdate,-10);
        System.out.println(Validator.validate(customerDto));
    }
}
