package validation;


import validation.annotation.*;

import java.time.LocalDate;

public class Customer {
    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthDay;
    @Min(0)
    @Max(100)
    private int discountRate;
//    @Max(1000)
//    private int price;

    public Customer(String name,String email,LocalDate birthDay,int discountRate,int price){
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
//        this.price = price;
    }

    public Customer(String  name) {
        this.name = name;


    }

    public Customer() {
    }

    public  String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
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
