package validation.dto;

import java.time.LocalDate;

import validation.annotations.Adulthood;
import validation.annotations.Length;
import validation.annotations.Max;
import validation.annotations.Min;
import validation.annotations.Email;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    private String email;


    @Adulthood
    private LocalDate birthDay;

    @Min()
    @Max()
    private int discountRate;




    public CustomerDto(String name, String email, LocalDate bd, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = bd;
        this.discountRate = discountRate;
    }

    public String getName() {

        return this.name;
    }

    public LocalDate getBirthDay() {

        return this.birthDay;
    }

    public String getEmail() {

        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
