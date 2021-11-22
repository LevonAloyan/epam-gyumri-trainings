package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validate {
    private final void validate(Object o) throws IllegalArgumentException {
        List<Error> errors = new ArrayList<>();

        Class<?> c = o.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field fieldName : fields) {
            if (fieldName.isAnnotationPresent(Email.class))
                System.out.println(fieldName.getName());
        }
    }
}

