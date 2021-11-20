package annotation;

import annotation.myannotation.AdulthoodAnnotationProcessor;
import annotation.myannotation.EmailAnnotationProcessor;
import annotation.myannotation.IntervalAnnotationProcessor;
import annotation.myannotation.LengthAnnotationProcessor;

import java.util.List;
import java.util.Map;

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


    public static void validate(Object ob) throws NoSuchFieldException, IllegalAccessException {
        LengthAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
        EmailAnnotationProcessor.definitionFieldsForAnnotationEmail(ob);
        IntervalAnnotationProcessor.definitionFieldsForAnnotationInterval(ob);
        AdulthoodAnnotationProcessor.definitionFieldsForAnnotationLength(ob);
    }
}
