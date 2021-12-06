package annotationDTO;

import annotationDTO.annotation.*;

import java.time.LocalDate;

public class Customer {
    @Length(min = 5, max = 30)
    private final String name;
    @Email
    private final String email;
    @Adulthood
    private final LocalDate birthday;
    @Min(minValue = 30)
    @Max(maxValue = 45)
    private final int discountRate;

    public Customer(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

}