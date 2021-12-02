package DTO_validation;

import DTO_validation.annotation.*;

import java.time.LocalDate;

public class CustomerDTO {


    @Length(minValue = 2, maxValue = 30, nameErrorMessage = "Name field length is not valid ")
    private String nameCustomer;
    private String nameErrorMessage;

    @Email(emailErrorMassage = "This fields does not contain an email address ")
    private String emailCustomer;
    private String emailErrorMessage;

    @Adulthood(adulthoodErrorMessage = "The client has not reached the age of majority ")
    private LocalDate birthDayCustomer;
    private String adulthoodErrorMessage;

    @Min(minValue = 0, minErrorMessage = "The number is  less than the limit specified in the parameter ")
    @Max(maxValue = 100, maxErrorMessage = "The number exceed the limit specified in the parameter ")
    private Integer discountRate;
    private String minErrorMessage;
    private String maxErrorMessage;


    public CustomerDTO(String name, String email, LocalDate birthDay, int discountRate) {
        this.nameCustomer = name;
        this.emailCustomer = email;
        this.birthDayCustomer = birthDay;
        this.discountRate = discountRate;
    }

    public String getName() {
        return nameCustomer;
    }

    public void setName(String name) {
        this.nameCustomer = name;
    }

    public String getEmail() {
        return emailCustomer;
    }

    public void setEmail(String email) {
        this.emailCustomer = email;
    }

    public LocalDate getBirthDay() {
        return birthDayCustomer;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDayCustomer = birthDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}