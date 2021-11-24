package DTO_validation.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Length {
    int minvalue();
    int maxvalue();
    String nameErrorMessage();
}

