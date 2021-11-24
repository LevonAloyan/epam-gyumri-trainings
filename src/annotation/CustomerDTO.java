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
    String message();
}
@interface Adulthood {
   int age();
   String message();
}
@interface Min {
    int min();
    String message();
}
@interface Max {
    int max();
    String message();
}
