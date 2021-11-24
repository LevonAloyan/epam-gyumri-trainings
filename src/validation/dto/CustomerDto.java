package validation.dto;

import java.time.LocalDate;

import validation.annotations.Length;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    private String email;
    private LocalDate birthDay;

    public CustomerDto(String name, String email, LocalDate bd) {
        this.name = name;
        this.email = email;
        this.birthDay = bd;
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
}
