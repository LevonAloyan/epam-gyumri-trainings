package validation;

import validation.annotation.*;
import validation.processor.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    LengthAnnotationProcessor processor=new LengthAnnotationProcessor();
    EmailAnnotationProcessor emailProcessor=new EmailAnnotationProcessor();
    AdulthoodAnnotationProcessor adulthoodProcessor=new AdulthoodAnnotationProcessor();
    MaxAnnotationProcessor maxProcessor=new MaxAnnotationProcessor();
    MinAnnotationProcessor minProcessor=new MinAnnotationProcessor();


    public String[] validate(Object o) throws NoSuchFieldException, IllegalAccessException {
        String[] errors;
        errors=processor.lengthProcessor(o);
        errors=emailProcessor.emailProcessor(o);
        errors=adulthoodProcessor.adulthoodProcessor(o);
        errors=maxProcessor.maxProcessor(o);
        errors=minProcessor.minProcessor(o);
        return errors;


    }

}

