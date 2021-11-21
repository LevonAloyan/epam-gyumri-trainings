package dtoannotations;

import java.time.LocalDate;

public class CustomerDTO {
    @Length(min = 5, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
    @Min(minValue = 30)
    @Max(maxValue = 45)
    private int discountRate;

    public CustomerDTO(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

}
