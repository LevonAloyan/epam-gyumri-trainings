package validaton.dto;

import validaton.annotation.*;

import java.time.LocalDate;

public class CostumerDto {
    @Length(min = 2,max = 20,errorMessage = "name field length is not valid.")
    private String name;
    @Email()
    private String email;
    @Adulthood
    private LocalDate birthDay;
    @Min(10)
    @Max(15)
    private int discountRate;


    public CostumerDto(String name, String email, LocalDate bd,int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = bd;
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

}
