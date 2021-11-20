package algorithms;

import java.time.LocalDate;
import java.util.jar.Attributes;

public class AnnotationValidator {

    public static void main(String[]args) throws IllegalAccessException{
        CustomerDto customerDto = new CustomerDto();
        customerDto.setBirthdate(LocalDate.of(2006,4,22));
        customerDto.setName("D");


        AdulthoodAnnotationProcessor processor = new AdulthoodAnnotationProcessor();
        processor.checkMajority(customerDto);
        LengthAnnotationProcessor processor1 = new LengthAnnotationProcessor();
        processor1.checkQuantity(customerDto);
    }

}
