package annotationDTO.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length {
    int min ();
    int max();
   // String nameErrorMessage();
//    int min() default 2;
//    int max() default  30;

}