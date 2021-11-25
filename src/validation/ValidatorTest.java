package validation;

import java.time.LocalDate;
import java.util.Arrays;

import validation.dto.CustomerDto;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Validator validator = new Validator();

        CustomerDto customerDto = new CustomerDto("aaa", "a@email.com", LocalDate.now(), 20);

        String[] errors = validator.validate(customerDto);

        System.out.println(Arrays.toString(errors));

        Class<?> errors1 = validator.validateAdult(customerDto);

        System.out.println(Arrays.toString(errors));

        String[] errors2 = validator.validateEmail(customerDto);
        System.out.println(Arrays.toString(errors));

        Class<?> errors3 = validator.validateMax(customerDto);
        System.out.println(Arrays.toString(errors));


        Class<?> errors4 = validator.validateMin(customerDto);

        System.out.println(Arrays.toString(errors));





    }

}
