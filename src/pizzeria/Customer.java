package pizzeria;

public class Customer {

    private final int customerNumber;
    private final String name;
    private final String phoneNumber;


    // todo implement necessary constructors
    // todo implement getters if needed

    public Customer (String name, String phoneNumber) {
        this.customerNumber = CustomerNumber();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int CustomerNumber() {
        return (int)(Math.random() * 10000);
    }
}
