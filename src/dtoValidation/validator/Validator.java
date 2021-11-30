package dtoValidation.validator;

import dtoValidation.processors.*;

public class Validator<T> {

    MaxLimitProcessor<T> maxLimitProcessor = new MaxLimitProcessor<>();
    MinLimitProcessor<T> minLimitProcessor = new MinLimitProcessor<>(maxLimitProcessor);
    AdulthoodProcessor<T> adulthoodProcessor = new AdulthoodProcessor<>(minLimitProcessor);
    EmailProcessor<T> emailProcessor = new EmailProcessor<>(adulthoodProcessor);
    LengthProcessor<T> lengthProcessor = new LengthProcessor<>(emailProcessor);
    AnnotationProcessor<T> chain = lengthProcessor;

    public String validate(T t) throws IllegalAccessException {
        return chain.validate(t) == null ? t.getClass().getSimpleName() + " is valid" : chain.validate(t);
    }

}