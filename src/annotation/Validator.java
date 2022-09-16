package annotation;
import java.util.ArrayList;
import java.util.List;

public class Validator {

    public <T> List<String> validate(T object) {
        List<String> validatorList = new ArrayList<>();
        validatorList.add(LengthProcess.validateLengthAnnotation(object) + "\n");
        validatorList.add(EmailProcess.validateEmailAnnotation(object) + "\n");
        validatorList.add(AdultValidProcess.validateAdulthoodAnnotation(object) + "\n");
        validatorList.add(MinProcess.validateMinAnnotation(object) + "\n");
        validatorList.add(MaxProcess.validateMaxAnnotation(object));
        return validatorList;
    }
}