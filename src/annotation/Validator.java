package annotation;

import annotation.exception.ExpectedTypeException;
import annotation.myannotation.*;

public class Validator {

    public <T> void validate(T ob) throws IllegalAccessException {

        AnnotationProcessor<T> processor;

        try {
            processor = new LengthAnnotationProcessor<>();
            processor.fieldValidation(ob);

            processor = new IntervalAnnotationProcessor<>();
            processor.fieldValidation(ob);

            processor = new EmailAnnotationProcessor<>();
            processor.fieldValidation(ob);

            processor = new AdulthoodAnnotationProcessor<>();
            processor.fieldValidation(ob);
        } catch (ExpectedTypeException e) {
            e.printStackTrace();
        }


        // new IntervalAnnotationProcessor<>().definitionFieldsForAnnotation(ob);


    }
}
