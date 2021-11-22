package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Length {
    String message();
    int min();
    int max();
}
@interface Email {
    String message() default "Please provide a valid email address";
}
@interface Adulthood {
   int age() default 6;
}
@interface Min {
    int min();
}
@interface Max {
    int max();
}
