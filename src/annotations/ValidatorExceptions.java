package annotations;

public class ValidatorExceptions extends RuntimeException{
    public ValidatorExceptions() {
    }

    public ValidatorExceptions(String message) {
        super(message);
    }
}
