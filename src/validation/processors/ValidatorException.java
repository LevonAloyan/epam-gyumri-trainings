package validation.processors;

public class ValidatorException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Type is incorrect";
    }
}
