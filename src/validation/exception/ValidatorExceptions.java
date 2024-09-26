package validation.exception;

public class ValidatorExceptions extends RuntimeException {
    
    public ValidatorExceptions (String message) {

        System.err.println(message);
        
    }
}
