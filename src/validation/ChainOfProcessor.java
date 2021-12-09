package validation;

import validation.processors.*;

public class ChainOfProcessor {

    public static <T> AnnotationProcessor<T> getChainOfProcessors(){

        AnnotationProcessor<T> adulthoodValidator = new AdulthoodValidator<>();
        AnnotationProcessor<T> emailValidator = new EmailValidator<>();
        AnnotationProcessor<T> lengthValidator = new LengthValidator<>();
        AnnotationProcessor<T> maxValidator = new MaxValidator<>();
        AnnotationProcessor<T> minValidator = new MinValidator<>();

        adulthoodValidator.setNextProcessor(emailValidator);
        emailValidator.setNextProcessor(lengthValidator);
        lengthValidator.setNextProcessor(maxValidator);
        maxValidator.setNextProcessor(minValidator);

        return adulthoodValidator;
    }
}
