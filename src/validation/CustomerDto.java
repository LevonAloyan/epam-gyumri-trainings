package validation;

import validation.annotation.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 3, max = 20)
    private String name;
    @Email
    private String email;
    @Min
    @Max
    private int discountRate;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Adulthood
    private LocalDate birthday;

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public CustomerDto(String name, String email, int discountRate, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.discountRate = discountRate;
        this.birthday=birthday;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
