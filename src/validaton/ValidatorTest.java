package validaton;

import validaton.dto.CostumerDto;

import java.time.LocalDate;
import java.util.Arrays;


public class ValidatorTest {
    public static void main(String[] args) throws IllegalAccessException {
        Validation<CostumerDto> validation = new Validation();


        CostumerDto costumerDto = new CostumerDto("Vanik", "kausdu@mail.com", LocalDate.of
                (1990,5,5), 11);
        String[] err = validation.validate(costumerDto);
        System.out.println(Arrays.toString(err));
    }
}
