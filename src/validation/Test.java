package validation;

import validation.processors.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Test<customer> {

    public static void main(String[] args) throws IllegalAccessException, NewCustomException {
        Customer customer = new Customer("Hovo","Hovo1104@gmail.com", LocalDate.of(2010, 4,11),102,1201);
        String[] errorMessages = new String[5];

        LengthValidator lengthValidator = new LengthValidator();
        String[] lengthValidatorErrorMessage = lengthValidator.validate(customer);

        EmailValidator emailValidator = new EmailValidator();
        String[] emailValidatorErrorMessage = emailValidator.validate(customer);

        AdulthoodValidator adulthoodValidator = new AdulthoodValidator();
        String[] adulthoodErrorMessage =adulthoodValidator.validate(customer);

        MaxValidator maxValidator = new MaxValidator();
        String[] maxAnnotationErrorMessage = maxValidator.validate(customer);

        MinValidator minValidator = new MinValidator();
        String[] minValidatorErrorMessage = minValidator.validate(customer);

        errorMessages[0]= Arrays.toString(lengthValidatorErrorMessage);
        errorMessages[1] = Arrays.toString(emailValidatorErrorMessage);
        errorMessages[2] = Arrays.toString(adulthoodErrorMessage);
        errorMessages[3] = Arrays.toString(maxAnnotationErrorMessage);
        errorMessages[4] = Arrays.toString(minValidatorErrorMessage);

        for (String errorMessage : errorMessages) {
            System.out.println(errorMessage);
        }

    }

}
