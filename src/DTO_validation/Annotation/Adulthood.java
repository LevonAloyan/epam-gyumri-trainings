package DTO_validation.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Adulthood {
    String adulthoodErrorMessage();

}

