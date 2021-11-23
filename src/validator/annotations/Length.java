package validator.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Length {
    int min();
    int max();
}
