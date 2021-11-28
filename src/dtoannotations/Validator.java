package dtoannotations;

import dtoannotations.processors.*;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private final LengthValidationProcessor length = new LengthValidationProcessor();
    private final AdulthoodValidationProcessor adulthood = new AdulthoodValidationProcessor();
    private final EmailValidationProcessor mail = new EmailValidationProcessor();
    private final MaxValidationProcessor max = new MaxValidationProcessor();
    private final MinValidationProcessor min = new MinValidationProcessor();

    public <T> List<String> validate(T object) {
        List<String> validatorList = new ArrayList<>();
        validatorList.add(length.process(object) + "\n");
        validatorList.add(mail.process(object) + "\n");
        validatorList.add(adulthood.process(object) + "\n");
        validatorList.add(min.process(object) + "\n");
        validatorList.add(max.process(object));
        return validatorList;
    }
}

