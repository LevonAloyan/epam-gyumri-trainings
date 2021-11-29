package validation;

import validation.processors.*;

import java.util.Arrays;


public class Validator <T> {
    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor =new MinAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor=new MaxAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor=new EmailAnnotationProcessor();

    public String[] validate(Object dto) throws IllegalAccessException {

        String [] errors;

        errors = lengthAnnotationProcessor.validateLength(dto);
        // minProcessor.validateMin()
        errors= minAnnotationProcessor.validateMin(dto);
        errors= maxAnnotationProcessor.validateMax(dto);
        errors= emailAnnotationProcessor.validateEmail(dto);



        return errors;
    }


}
