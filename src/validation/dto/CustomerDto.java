package validation.dto;
import validation.annotation.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 3, max = 30, message = "Name length is not valid.")
    private String name;
    @Email
    @Length(min = 2, max = 20, message = "Email length is not valid.")
    private String email;
    @Adulthood
    private LocalDate birthDay;
    @Min(minValue = 0)
    @Max(maxValue = 55)
    private int discountRate;
    private int adulthood;

    public CustomerDto(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthDay = birthday;
        this.discountRate = discountRate;
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

    public int getAdulthood() {
        return adulthood;
    }

    public int getDiscountRate() {
        return discountRate;
    }

}
