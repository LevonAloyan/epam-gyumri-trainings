package validation;

import validation.processor.EmailAnnotationProcessor;

import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Validator costumeAnnotation = new Validator();
        CustomerDto customerDto = new CustomerDto("skkk", "amail",3,);
        EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
        costumeAnnotation.validate(customerDto);


    }

}

