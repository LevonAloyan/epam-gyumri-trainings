package annotation;

public class main {
    CustomerDto CustomerDto = new CustomerDto("Mike","sgh@mail.ru", 1980-01-01);
    EmailAnnotationProcessor emailAnnotation = new EmailAnnotationProcessor();
    LengthAnnotation lengthAnnotation = new LengthAnnotation();


    emailAnnotation.email(CustomerDto);
    lengthAnnotation.length(CustomerDto);

}
