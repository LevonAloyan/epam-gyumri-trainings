package validation;

import validation.dto.CustomerDto;

import java.time.LocalDate;
import java.util.Arrays;

public class ValidatorTest {
public static LocalDate date = LocalDate.now();
public  static LocalDate date2 = LocalDate.of(2004, 2, 23);



    public static void main(String[] args) throws IllegalAccessException {



        Validator validator = new Validator();

        CustomerDto customerDto = new CustomerDto("poxos", "poxos@mail.com", LocalDate.of(2004, 2, 1));
        customerDto.setDiscountRate(21);




        String[] errors = validator.validate(customerDto);


        System.out.println(Arrays.toString(errors));

        String[] emailErrors = validator.validateEmail(customerDto);

        System.out.println(Arrays.toString(emailErrors));


        String[] adulthoodValidation = validator.adulthoodValidation(customerDto);

        System.out.println(Arrays.toString(adulthoodValidation));

        String[] minDiscountValidation = validator.minDiscountValidation(customerDto);

        System.out.println(Arrays.toString(minDiscountValidation));

        String[] maxDiscountValidation = validator.maxDiscountValidation(customerDto);

        System.out.println(Arrays.toString(maxDiscountValidation));


    }
}
