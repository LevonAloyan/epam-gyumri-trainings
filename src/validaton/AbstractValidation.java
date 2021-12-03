package validaton;

import validaton.processor.*;

import java.util.Set;

public abstract class AbstractValidation<T> {
    protected AbstractValidation<T> next;

    public AbstractValidation<T> getNext() {
        return next;
    }

    public void setNext(AbstractValidation<T> next) {
        this.next = next;
    }


    public abstract Set<String> validate(T dto) throws IllegalAccessException;


    //throws IllegalAccessException {
//        String[] errors = new String[5];
//
//        errors[0] = processor.validateLength(dto);
//        errors[1] = emailProcessor.validateEmail(dto);
//        errors[2] = adulthoodProcessor.validateAdulthood(dto);
//        errors[3] = minProcessor.validateMin(dto);
//        errors[4] = mixProcessor.validateMax(dto);
//        return errors;
//    }
}
