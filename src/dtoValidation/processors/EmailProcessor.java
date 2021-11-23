package dtoValidation.processors;

import dtoValidation.annotations.Email;
import dtoValidation.dto.Dto;
import dtoValidation.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailProcessor implements AnnotationProcessor{

    @Override
    public Error validate(Dto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                String email = field.get(dto).toString();
                final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    return null;
                }
            }
        }
        return Error.EmailError;
    }

}
