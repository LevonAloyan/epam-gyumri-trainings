package annotation;

import annotation.my_annotation.AdulthoodAnnotationProcessor;
import annotation.my_annotation.EmailAnnotationProcessor;
import annotation.my_annotation.IntervalAnnotationProcessor;
import annotation.my_annotation.LengthAnnotationProcessor;

public class Validator {
    public static void validate(Object ob) throws NoSuchFieldException, IllegalAccessException {
        LengthAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
        EmailAnnotationProcessor.definitionFieldsForAnnotationEmail(ob);
        IntervalAnnotationProcessor.definitionFieldsForAnnotationInterval(ob);
        AdulthoodAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
    }
}