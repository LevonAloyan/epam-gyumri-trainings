package genericsValidator;

import genericsValidator.dto.CustomerDto;
import genericsValidator.processors.AnnotationProcessor;

import java.time.LocalDate;
import java.util.Arrays;

public class AnnotationTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2010, 5, 15);
        Validate<CustomerDto> validate = new Validate<>();
        CustomerDto customerDto = new CustomerDto("a", "sdf@g.com", localDate, 10);
        AnnotationProcessor<CustomerDto> chainOfProcessors = ChainOfProcessor.getChainOfProcessors();
        chainOfProcessors.validate(customerDto);

        System.out.println(customerDto);
        String[] errors = validate.validate(customerDto);
        System.out.println(Arrays.toString(errors));
    }
}
