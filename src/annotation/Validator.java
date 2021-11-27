package annotation;

import annotation.exception.ExpectedTypeException;
import annotation.myannotation.*;

import java.util.Arrays;

public class Validator {
    /**
     * Создайте класс Validator с одним методом проверки,
     * который принимает в качестве входных данных dto
     * и возвращает список ошибок, обнаруженных в процессе проверки.
     * Класс должен работать с любым типом DTO
     */
    /**
     * При чтении аннотаций из полей dto необходимо проверять каждое
     * поле в зависимости от размещенной над ним аннотации.
     * В случае ошибки добавьте его в итоговый список
     */


    public static <T> void validate(T ob) throws Throwable {


        LengthAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
        IntervalAnnotationProcessor.definitionFieldsForAnnotationInterval(ob);
        EmailAnnotationProcessor.definitionFieldsForAnnotationEmail(ob);
        AdulthoodAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
    }
}
