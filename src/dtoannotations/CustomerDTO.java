package dtoannotations;

import java.time.LocalDate;

public class CustomerDTO {
    @Length(min = 5, max = 30)
    public static String name;
    @Email
    public  static String email;
    @Adulthood
    public static LocalDate birthday;
    @Min(minValue = 30)
    @Max(maxValue = 45)
    public static int discountRate;

    public CustomerDTO(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

}
