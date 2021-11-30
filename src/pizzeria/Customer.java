package pizzeria;

public class Customer {
    private static int customerNumber = 1000;
    private String name;

    public Customer(int customerNumber, String name) {
        this.customerNumber = ++customerNumber;
        this.name = name;
    }

    public static int getCustomerNumber() {
        return customerNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
