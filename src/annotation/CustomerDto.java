package annotation;

import annotation.myannotation.Adulthood;
import annotation.myannotation.Email;
import annotation.myannotation.Interval;
import annotation.myannotation.Length;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerDto {

    @Length(min = 3, max = 8)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthDay;

    //@Min and @Max combined into one with the ability to specify both MIN and MAX or only MIN

//    @Interval(min = 2, max = 5)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return discountRate == that.discountRate && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(birthDay, that.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, birthDay, discountRate);
    }
}
