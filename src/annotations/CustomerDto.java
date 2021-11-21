package annotations;

import java.time.LocalDate;

public class CustomerDto extends Dto {

    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
    @Min(2)
    @Max(100)
    private int discountRate;


    public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

}
