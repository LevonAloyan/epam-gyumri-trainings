package validation.dto;

import validation.annotations.*;

import java.time.LocalDate;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    @Email
    private String email;

    @Adulthood
    private LocalDate birthDay;

    @Min(min = 10)
    @Max(max = 20)
    private int discountRate;


    public CustomerDto(String name, String email, LocalDate bd) {
        this.name = name;
        this.email = email;
        this.birthDay = bd;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }


}
