package dtoValidation.validator;

import dtoValidation.dto.Dto;
import dtoValidation.annotations.*;
import dtoValidation.error.Error;
import dtoValidation.processors.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator<T> {

    LengthProcessor<T> lengthProcessor;
    EmailProcessor<T> emailProcessor;
    AdulthoodProcessor<T> adulthoodProcessor;
    MinLimitProcessor<T> minLimitProcessor;
    MaxLimitProcessor<T> maxLimitProcessor;
    List<Error> errors;

    public List<Error> validate(T t) throws IllegalAccessException {
        errors = new ArrayList<>();
        lengthProcessor = new LengthProcessor<>();
        emailProcessor = new EmailProcessor<>();
        adulthoodProcessor = new AdulthoodProcessor<>();
        minLimitProcessor = new MinLimitProcessor<>();
        maxLimitProcessor = new MaxLimitProcessor<>();
        if (lengthProcessor.validate(t) != null) {
            errors.add(lengthProcessor.validate(t));
        }
        if (emailProcessor.validate(t) != null) {
            errors.add(Error.EmailError);
        }
        if (adulthoodProcessor.validate(t) != null) {
            errors.add(Error.AdulthoodError);
        }
        if (minLimitProcessor.validate(t) != null) {
            errors.add(Error.MinLimitError);
        }
        if (maxLimitProcessor.validate(t) != null) {
            errors.add(Error.MaxLimitError);
        }
        return errors;
    }


}
