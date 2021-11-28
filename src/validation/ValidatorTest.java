package validation;

import java.time.LocalDate;
import java.util.Arrays;

import validation.dto.CustomerDto;

public class ValidatorTest<T> {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Validator<?> validator = new Validator<>();

        CustomerDto customerDto = new CustomerDto("aaa", "a@email.com", LocalDate.now(), 20);



        Class<?> errors = validator.validateLength(customerDto);

        System.out.println(Arrays.toString(new Class[]{errors}));



        Class<?> errors1 = validator.validateAdult(customerDto);
        System.out.println(Arrays.toString(new Class[]{errors1}));

        Class<?> errors2 = validator.validateEmail(customerDto);
        System.out.println(Arrays.toString(new Class[]{errors2}));

        Class<?> errors3 = validator.validateMax(customerDto);
        System.out.println(Arrays.toString(new Class[]{errors3}));


        Class<?> errors4 = validator.validateMin(customerDto);
        System.out.println(Arrays.toString(new Class[]{errors4}));





    }

}
