package annotation;

import annotation.myannotation.Adulthood;
import annotation.myannotation.Email;
import annotation.myannotation.Interval;
import annotation.myannotation.Length;

import java.time.LocalDate;

public class CustomerDto {

    @Length(min = 3, max = 8)
//    @Interval(min = 5) //Ok
    private String name;
//    @Length(min = 16) //Ok
    @Email
    private String email;
    @Adulthood
    private LocalDate birthDay;

    //@Min and @Max combined into one with the ability to specify both MIN and MAX or only MIN

    @Interval(min = 2)
    private int discountRate;


    public CustomerDto(String name, String email, String birthDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = LocalDate.parse(birthDay);
        this.discountRate = discountRate;
    }

    public CustomerDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

}
