package algorithms;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class CustomerDto {
    @Length(min=2,max=30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
     @Min(min = 0)
    @Max(max = 100)
    private int discountRate;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
