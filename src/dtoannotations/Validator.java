package dtoannotations;

import dtoannotations.processors.*;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private final LengthValidationProcess length = new LengthValidationProcess();
    private final AdulthoodValidationProcess adulthood = new AdulthoodValidationProcess();
    private final EmailValidationProcess mail = new EmailValidationProcess();
    private final MaxValidationProcess max = new MaxValidationProcess();
    private final MinValidationProcess min = new MinValidationProcess();

    public <T> List<String> validate(T object) {
        List<String> validatorList = new ArrayList<>();
        validatorList.add(length.processor(object) + "\n");
        validatorList.add(mail.processor(object) + "\n");
        validatorList.add(adulthood.processor(object) + "\n");
        validatorList.add(min.processor(object) + "\n");
        validatorList.add(max.processor(object));
        return validatorList;
    }
}

