package annotation.myannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Interval {

    int min();

    int max() default Integer.MAX_VALUE;

}
