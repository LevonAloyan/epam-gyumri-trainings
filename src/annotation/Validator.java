package annotation;

import annotation.exception.ExpectedTypeException;
import annotation.myannotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Validator {

    public <T> List<InvalidData> validate(T ob) throws IllegalAccessException {

        List<InvalidData> dataArrayList = new ArrayList<>();

        AnnotationProcessor<T> processor;

        try {
            processor = new LengthAnnotationProcessor<>();
            dataArrayList.add(processor.fieldValidation(ob));
        } catch (ExpectedTypeException e) {
            e.printStackTrace();
        }
        try {
            processor = new AdulthoodAnnotationProcessor<>();
            dataArrayList.add(processor.fieldValidation(ob));
        } catch (ExpectedTypeException e) {
            e.printStackTrace();
        }
        try {
            processor = new EmailAnnotationProcessor<>();
            dataArrayList.add(processor.fieldValidation(ob));
        } catch (ExpectedTypeException e) {
            e.printStackTrace();
        }
        try {

            processor = new IntervalAnnotationProcessor<>();
            dataArrayList.add(processor.fieldValidation(ob));
        } catch (ExpectedTypeException e) {
            e.printStackTrace();
        }


        // new IntervalAnnotationProcessor<>().definitionFieldsForAnnotation(ob);
        dataArrayList.removeIf(Objects::isNull);

        return dataArrayList;
    }
}
