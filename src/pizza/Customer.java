package pizza;

public class Customer {

    private int customerNumber;
    private String name;
    private String phoneNumber;


    public Customer (int customerNumber, String name, String phoneNumber) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerNumber () {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

