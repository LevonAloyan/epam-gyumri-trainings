package validator;

import validator.dto.CustomerDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        LocalDate localDate = LocalDate.parse("2010/10/10", DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        CustomerDto dto = new CustomerDto("l","anidarbinyangmail.com", localDate,250);

        Validator validator = new Validator();

        String[] errors = validator.validate(dto);
        System.out.println(Arrays.toString(errors));
    }
}
