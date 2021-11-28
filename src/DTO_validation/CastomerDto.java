package DTO_validation;

import DTO_validation.Annotation.*;

import java.time.LocalDate;

public class CastomerDto {


    @Length(minvalue = 2, maxvalue = 30, nameErrorMessage = "Name field length is not valid " )
    private String name;
    private String nameErrorMessage;

    @Email(emailErrorMassage = "This fields does not contain an email address ")
    private String email;
    private String emailErrorMessage;

    @Adulthood(adulthoodErrorMessage = "The client has not reached the age of majority ")
    private LocalDate birthDay;
    private String adulthoodErrorMessage;

    @Min(valueMin = 0, minErrorMessage = "The number is  less than the limit specified in the parameter ")
    @Max(valueMax = 100, maxErrorMessage = "The number exceed the limit specified in the parameter ")
    private Integer discountRate;
    private String minErrorMessage;
    private String maxErrorMessage;


    public CastomerDto(String name, String email, LocalDate birthDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
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