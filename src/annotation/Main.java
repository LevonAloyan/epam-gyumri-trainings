package annotation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        CustomerDto customerDto = new CustomerDto("a", "mail@.ru", "2020-07-29", 1);

        Validator validator = new Validator();

        System.out.println(validator.validate(customerDto));


        System.out.println("end");


    }
}
