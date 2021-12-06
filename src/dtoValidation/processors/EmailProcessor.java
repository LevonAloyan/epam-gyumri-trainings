package dtoValidation.processors;

import dtoValidation.annotations.Email;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailProcessor<T> extends AnnotationProcessor<T> {

    public EmailProcessor() {
    }

    public EmailProcessor(AnnotationProcessor<T> nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public String validate(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                String email = field.get(t).toString();
                final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    return nextProcessor == null ? null : nextProcessor.validate(t);
                }
            }
        }
        return "Wrong email format";
    }

}