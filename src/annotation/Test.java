package annotation;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer("A","aaaaaa@gmail.com", 15,60);

        AdulthoodValidator adulthoodValidator = new AdulthoodValidator();
        adulthoodValidator.validate(customer);

        LengthValidator lengthValidator = new LengthValidator();
        lengthValidator.validate(customer);

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate(customer);

        MinValidator minValidator = new MinValidator();
        minValidator.validate(customer);

        MaxValidator maxValidator = new MaxValidator();
        maxValidator.validate(customer);

    }

}


