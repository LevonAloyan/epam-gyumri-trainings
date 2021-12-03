package validaton;

import validaton.dto.CostumerDto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;


public class ValidatorTest {
    public static void main(String[] args) throws IllegalAccessException {
        AbstractValidation<CostumerDto> abstractValidation = ChainOfResponsible.getInstance();


        CostumerDto costumerDto = new CostumerDto("V", "ka", LocalDate.of
                (2011,5,5), 11);
        Set<String> err = abstractValidation.validate(costumerDto);
        System.out.println(err);
    }
}
