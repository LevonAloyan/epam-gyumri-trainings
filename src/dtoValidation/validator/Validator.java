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

public class Validator {

    LengthProcessor lengthProcessor;
    EmailProcessor emailProcessor;
    AdulthoodProcessor adulthoodProcessor;
    MinLimitProcessor minLimitProcessor;
    MaxLimitProcessor maxLimitProcessor;
    List<Error> errors;

    public List<Error> validate(Dto dto) throws IllegalAccessException {
        errors = new ArrayList<>();
        lengthProcessor = new LengthProcessor();
        emailProcessor = new EmailProcessor();
        adulthoodProcessor = new AdulthoodProcessor();
        minLimitProcessor = new MinLimitProcessor();
        maxLimitProcessor = new MaxLimitProcessor();
        if (lengthProcessor.validate(dto) != null) {
            errors.add(lengthProcessor.validate(dto));
        }
        if (emailProcessor.validate(dto) != null) {
            errors.add(Error.EmailError);
        }
        if (adulthoodProcessor.validate(dto) != null) {
            errors.add(Error.AdulthoodError);
        }
        if (minLimitProcessor.validate(dto) != null) {
            errors.add(Error.MinLimitError);
        }
        if (maxLimitProcessor.validate(dto) != null) {
            errors.add(Error.MaxLimitError);
        }
        return errors;
    }


}
