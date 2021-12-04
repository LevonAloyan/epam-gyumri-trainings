package validation;

import java.time.LocalDate;
import java.util.Arrays;


import validation.dto.CustomerDto;
import validation.processors.AnnotationProcessor;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("aaa", "@jj",LocalDate.of(1993,12,01),9);
        AnnotationProcessor<CustomerDto> chainOfProcessors = ChainOfProcessor.getChainOfProcessors();
      String[] cust=chainOfProcessors.validate(customerDto);
        System.out.println(Arrays.toString(cust));

    }
}
