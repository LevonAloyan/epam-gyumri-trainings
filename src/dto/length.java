package dto;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)

@interface Length {
    int min ();
    int max ();
}

@interface Email{
}

@interface Adulthood{

}

@interface Min{
int min ();
}

@interface Max{
int max();
}