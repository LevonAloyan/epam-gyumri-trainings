package annotation;


import annotation.exception.ExpectedTypeException;

public class Main {
    public static void main(String[] args) throws Throwable {

        CustomerDto customerDto = new CustomerDto("a", "mail@.ru", "2020-07-29", 1);

        Validator validator = new Validator();

        validator.validate(customerDto);


        System.out.println("end");


    }
}
