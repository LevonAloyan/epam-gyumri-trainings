package validation;

import java.time.LocalDate;
// import java.util.Arrays;

import validation.dto.CustomerDto;
import validation.processors.AnnotationProcessor;

public class ValidatorTest {

    public static void main(String[] args) throws IllegalAccessException {

        // Validator<CustomerDto> validator = new Validator<CustomerDto>();

        CustomerDto customerDto = new CustomerDto("N", "email@gmail.com", LocalDate.of(2011,11,11), 10);

        AnnotationProcessor <CustomerDto> chainOfProcessors = ChainOfProcessor.getChainOfProcessors();
        chainOfProcessors.validate(customerDto);

        // String[] validate = validator.validates(customerDto);
        // System.out.println(Arrays.toString(validate));

    }
}
