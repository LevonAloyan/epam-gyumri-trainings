package dtoannotations.validationexceptions;

public class IncorrectEmailException extends Exception {
    public IncorrectEmailException(String message) {
        super(message);
    }
}
