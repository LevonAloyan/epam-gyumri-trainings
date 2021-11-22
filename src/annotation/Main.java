package annotation;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Validator costumeAnnotation = new Validator();
        CustomerDto customerDto = new CustomerDto("skkk", "amail");
        EmailAnnotation emailAnnotation = new EmailAnnotation();
//        costumeAnnotation.length(customerDto);
        emailAnnotation.email(customerDto);

    }

}

