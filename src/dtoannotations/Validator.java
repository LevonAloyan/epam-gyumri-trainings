package dtoannotations;

import dtoannotations.annotationprocessors.*;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public <T> List<String> validate(T object) {
        List<String> validatorList = new ArrayList<>();
        validatorList.add(LengthValidationProcess.validateLengthAnnotation(object) + "\n");
        validatorList.add(EmailValidationProcess.validateEmailAnnotation(object) + "\n");
        validatorList.add(AdulthoodValidationProcess.validateAdulthoodAnnotation(object) + "\n");
        validatorList.add(MinValidationProcess.validateMinAnnotation(object) + "\n");
        validatorList.add(MaxValidationProcess.validateMaxAnnotation(object));
        return validatorList;
    }
}

