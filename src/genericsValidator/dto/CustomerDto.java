package genericsValidator.dto;

import genericsValidator.Validate;
import genericsValidator.annotations.*;

import java.time.LocalDate;

public class CustomerDto extends Validate {
    @Length(min = 2, max = 30, message = "Name must be between 2 and 30 characters.")
    private String name;

    @Email(message = "Please provide a valid email address.")
    private String email;

    @Adulthood(age = 0, message = "Age can't be less then 18.")
    private LocalDate birthDay;

    @Min(value = 0, message = " Incorrect argument.")
    @Max(value = 100, message = " Incorrect argument.")
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthDay, int discountRate){
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString(){
        return getName() + ", " + getEmail() + ", " + getBirthDay();
    }

}
