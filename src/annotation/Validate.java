package annotation;

public class Validate <V> {
    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
    private MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();

    public String[] validate(Validate dto) throws IllegalArgumentException {
        String[] errors;
        try {
            errors = lengthAnnotationProcessor.validate(dto);
            errors = emailAnnotationProcessor.validate(dto);
            errors = adulthoodAnnotationProcessor.validate(dto);
            errors = maxAnnotationProcessor.validate(dto);
            errors = minAnnotationProcessor.validate(dto);
        }catch (ValidationException e){
            e.printStackTrace();
            throw new ValidationException("Validation error", e);

        }

        return errors;
    }
}

