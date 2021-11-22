package annotation;

public class CustomerDto {
    @Length(min = 2, max = 30)
    private   String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
    @Min(minValue = 0)
    @Max(maxValue = 100)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public String getEmail() { return email; }



    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) { this.email = email; }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    //I don't understand what to do next
}
