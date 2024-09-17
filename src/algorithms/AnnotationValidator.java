package algorithms;

import java.time.LocalDate;

public class AnnotationValidator {

    public static void main(String[]args) throws IllegalAccessException{
        CustomerDto customerDto = new CustomerDto("D",
                "balabekyandavo@gmail.com",
                LocalDate.of(2006,4,22),
                -5);
        //customerDto.setBirthdate(LocalDate.of(2006,4,22));
        //customerDto.setName("D");

        LengthAnnotationProcessor lengthProcess = new LengthAnnotationProcessor();
        lengthProcess.checkQuantity(customerDto);

        EmailAnnotationProcessor emailProcess = new EmailAnnotationProcessor();
        emailProcess.checkEmail(customerDto);

        AdulthoodProcessor adulthoodProcessor = new AdulthoodProcessor();
        adulthoodProcessor.checkMajority(customerDto);

        MinAnnotationProcessor minProcessor= new MinAnnotationProcessor();
        minProcessor.checkMin(customerDto);

        MaxAnnotationProcessor maxProcessor = new MaxAnnotationProcessor();
        maxProcessor.checkMax(customerDto);

    }

}
