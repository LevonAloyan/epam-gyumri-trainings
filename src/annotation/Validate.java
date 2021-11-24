package annotation;

public class Validate {
    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();

    public  String[] validate(Object dto) throws IllegalArgumentException {
        String[] errors;
        errors = lengthAnnotationProcessor.validate(dto);
        errors = emailAnnotationProcessor.validate(dto);
        errors = adulthoodAnnotationProcessor.validate(dto);
        errors = maxAnnotationProcessor.validate(dto);
        errors = minAnnotationProcessor.validate(dto);

        return errors;
    }
}

