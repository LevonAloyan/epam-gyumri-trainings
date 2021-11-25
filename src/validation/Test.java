package validation;

import validation.processors.*;

import java.time.LocalDate;

public class Test<customer> {

    public static void main(String[] args) throws IllegalAccessException, NewCustomException {
        Customer customer = new Customer("H","Hovo1104@gmail.com", LocalDate.of(2010, 4,11),18);

        AdulthoodValidator adulthoodValidator = new AdulthoodValidator();
        adulthoodValidator.validate(customer);

        LengthValidator lengthValidator = new LengthValidator();
        lengthValidator.validate(customer);

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate(customer);

        MinValidator minValidator = new MinValidator();
        minValidator.validate(customer);

        MaxValidator maxValidator = new MaxValidator();
        maxValidator.validate(customer);

    }

}
