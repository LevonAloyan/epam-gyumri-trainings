package validation.dto;

import java.time.LocalDate;

import validation.annotations.*;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    @Email()
    private String email;
    @Adulthood()
    private LocalDate birthDay;
    @Max(100)
    @Min(0)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthDay, int discountRate) {
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


}