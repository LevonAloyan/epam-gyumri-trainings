package validation;

import validation.processors.AnnotationProcessor;
import validation.processors.NewCustomException;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) throws IllegalAccessException, NewCustomException {
        Customer customer = new Customer("Hovo","Hovo1104@gmail.com", LocalDate.of(2010, 4,11),102,1201);
        String[] errorMessages = new String[5];

        AnnotationProcessor<Customer> chainOfProcessors = ChainOfProcessor.getChainOfProcessors();
        chainOfProcessors.validate(customer);

    }

}
