package validaton;

import validaton.annotation.Length;
import validaton.dto.CostumerDto;
import validaton.processor.*;

import java.lang.reflect.Field;

public class Validation<T> {

    private LengthAnnotationProcessor<T> processor = new LengthAnnotationProcessor<>();
    private EmailAnnotationProcessor<T> emailprocessor = new EmailAnnotationProcessor<>();
    private AdulthoodAnnotationProcessor<T> adulthoodProcessor = new AdulthoodAnnotationProcessor<>();
    private MinAnnotationProcessor<T> minProcessor = new MinAnnotationProcessor<>();
    private MixAnnotationProcessor<T> mixProcessor = new MixAnnotationProcessor<>();

    public String[] validate(T dto) throws IllegalAccessException {
        String[] errors = new String[5];

        errors[0] = processor.validateLength(dto);
        errors[1] = emailprocessor.validateEmail(dto);
        errors[2] = adulthoodProcessor.validateAdulthood(dto);
        errors[3] = minProcessor.validateMin(dto);
        errors[4] = mixProcessor.validateMax(dto);
        return errors;
    }
}
