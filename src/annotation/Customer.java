package annotation;

public class Customer {
    @Length(min = 2, max = 15)
    private String name;

    @Email
    private String email;

    @Adulthood(18)
    private int age;
    @Min(2)
    @Max(50)
    private int discountRate;

    public Customer(String name,String email,int age,int discountRate){
        this.name = name;
        this.email = email;
        this.age = age;
        this.discountRate = discountRate;
    }

    public Customer(String  name) {
        this.name = name;


    }

    public Customer() {
    }

    public  String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}

