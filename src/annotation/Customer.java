package annotation;

import java.time.LocalDate;

public class Customer {
    @Length(min = 5, max = 30)
    public  String name;
    @Email
    public  String email;
    @Adulthood
    public  LocalDate birthday;
    @Min(minValue = 30)
    @Max(maxValue = 45)
    public int discountRate;

    public Customer(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

}