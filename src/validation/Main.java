package validation;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Validator costumeAnnotation = new Validator();
        CustomerDto customerDto = new CustomerDto("skkk", "amail",3,LocalDate.now());
        costumeAnnotation.validate(customerDto);
        String[] errors = costumeAnnotation.validate(customerDto);


        System.out.println(Arrays.toString(errors));


    }

}

