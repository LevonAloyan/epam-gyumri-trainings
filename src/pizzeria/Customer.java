package pizzeria;

public class Customer {

    private int customerNumber = 0;
    private String name;
    private String phoneNumber;

    // todo implement necessary constructors
    // todo implement getters if needed

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerNumber++;
    }

    public static Customer addNewCostumer(String name, String phoneNumber) {
        return new Customer(name, phoneNumber);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
