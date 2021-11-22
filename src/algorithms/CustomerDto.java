package algorithms;

import java.time.LocalDate;

public class CustomerDto {

    @Length(min = 2, max = 30)//+
    private String name;

    @Email//+
    private String email;

    @Adulthood//+
    private LocalDate birthdate;
    @Min(0)
    @Max(100)
    private int DiscountRate;

    public CustomerDto(String name, String email, LocalDate birthdate, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.DiscountRate = discountRate;
    }

    public CustomerDto() {
    }

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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(int discountRate) {
        DiscountRate = discountRate;
    }

}
