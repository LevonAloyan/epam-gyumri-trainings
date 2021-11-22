package anotation;

import java.time.LocalDate;



public class CustomerDto {

    @Length (min = 2, max = 30)
    private String name;

    @Email
    private String email;

    @Adulthood
    private LocalDate birthday;

    @Min(0)
    @Max(100)
    private int discountRate;

}