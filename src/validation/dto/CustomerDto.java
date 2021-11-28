package validation.dto;

import java.time.LocalDate;

import validation.annotations.Length;
import validation.annotations.Max;
import validation.annotations.Min;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    private String email;
    private LocalDate birthDay;
    private int adulthood;
    @Max(max = 9)
    @Min(min = 3)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate bd, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = bd;
        this.discountRate = discountRate;
    }

    public CustomerDto(String name, String email, LocalDate birthDay, int adulthood, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.adulthood = adulthood;
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


    public int getAdulthood() {
        return adulthood;
    }


    public int getDiscountRate() {
        return discountRate;
    }


}