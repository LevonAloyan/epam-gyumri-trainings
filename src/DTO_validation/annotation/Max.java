package DTO_validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Max {
    int maxValue();
    String maxErrorMessage();
}
