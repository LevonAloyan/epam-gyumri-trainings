package annotation;

public class CustomerDto {
    @Length(min = 3, max = 20)
    private String name;
    @Email
    private String email;
    @Min
    @Max
    private int discountRate;

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public CustomerDto(String name, String email, int discountRate) {
        this.name = name;
        this.email = email;
        this.discountRate = discountRate;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
