package annotation;
import java.util.ArrayList;
import java.util.List;

public class Validator {

    private final LengthProcess length = new LengthProcess();
    private final EmailProcess mail = new EmailProcess();
    private final AdultValidProcess adulthood = new AdultValidProcess();
    private final MinProcess min = new MinProcess();
    private final MaxProcess max = new MaxProcess();

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