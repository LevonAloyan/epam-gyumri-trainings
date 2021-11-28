package validation.dto;

import java.time.LocalDate;
import java.util.Objects;

import validation.annotations.Adulthood;
import validation.annotations.Length;
import validation.annotations.Max;
import validation.annotations.Min;
import validation.annotations.Email;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Email
    private String email;


    @Adulthood
    private LocalDate birthDay;

    @Min()
    @Max()
    private int discountRate;


    public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthday;
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
