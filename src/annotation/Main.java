package annotation;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        LengthAnnotation costumeAnnotation = new LengthAnnotation();
        CustomerDto customerDto = new CustomerDto("skkk", "amail");
        EmailAnnotation emailAnnotation = new EmailAnnotation();
        costumeAnnotation.length(customerDto);
        emailAnnotation.email(customerDto);

    }

}

