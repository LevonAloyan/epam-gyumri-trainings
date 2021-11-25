package validation.dto;

import java.time.LocalDate;

import validation.annotations.Length;
import validation.annotations.Min;

public class CustomerDto {

    @Length(min = 2, max = 20, message = "name field length is not valid.")
    private String name;

    @Length(min = 2, max = 30, message = "Email length is not valid.")
    private String email;

    @Min(value = 0)
    private Integer discountRate;

    private LocalDate birthDay;

    public CustomerDto(String name, String email, LocalDate bd) {
        if (name.length() < 2 || name.length() > 20) {
            throw new RuntimeException("Name is not valid");
        }
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
