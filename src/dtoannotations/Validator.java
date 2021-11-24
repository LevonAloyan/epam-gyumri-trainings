package dtoannotations;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private final LengthValidationProcess length = new LengthValidationProcess();
    private final EmailValidationProcess mail = new EmailValidationProcess();
    private final AdulthoodValidationProcess adulthood = new AdulthoodValidationProcess();
    private final MinValidationProcess min = new MinValidationProcess();
    private final MaxValidationProcess max = new MaxValidationProcess();

    public List<String> validate(Object object) throws IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add(length.ValidateLengthAnnotation(object) + "\n");
        list.add(mail.ValidateEmailAnnotation(object) + "\n");
        list.add(adulthood.ValidateAdulthoodAnnotation(object) + "\n");
        list.add(min.ValidateMinAnnotation(object) + "\n");
        list.add(max.ValidateMaxAnnotation(object));

        return list;
    }
}

