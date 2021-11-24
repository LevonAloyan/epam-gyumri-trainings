package validation;

import validation.processor.*;

public class Validator {
    LengthAnnotationProcessor processor=new LengthAnnotationProcessor();
    EmailAnnotationProcessor emailProcessor=new EmailAnnotationProcessor();
    AdulthoodAnnotationProcessor adulthoodProcessor=new AdulthoodAnnotationProcessor();
    MaxAnnotationProcessor maxProcessor=new MaxAnnotationProcessor();
    MinAnnotationProcessor minProcessor=new MinAnnotationProcessor();


    public String[] validate(Object o) throws NoSuchFieldException, IllegalAccessException {
        String[] errors=new String[5];
        errors[0]= String.valueOf(processor.lengthProcessor(o));
        errors[1]= String.valueOf(emailProcessor.emailProcessor(o));
        errors[2]= String.valueOf(adulthoodProcessor.adulthoodProcessor(o));
         errors[3]= String.valueOf(maxProcessor.maxProcessor(o));
        errors[4]= String.valueOf(minProcessor.minProcessor(o));
        return errors;


    }

}

