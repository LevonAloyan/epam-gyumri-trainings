package annotation;


public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        CustomerDto customerDto = new CustomerDto("vaaaaay", "vayvay@mail.", "2020-07-29", 1);

        Validator.validate(customerDto);


    }
}