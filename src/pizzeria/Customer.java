package pizzeria;

public class Customer {

    private int customerNumber;
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerNumber = getRandomId(9999, 1000);
    }

    public int getRandomId(int max, int min) {
        return (int) ((Math.random() * (max - min)) + +min);
    }

    public static Customer addCustomer(String name, String phoneNumber) {
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
// todo implement necessary constructors
    // todo implement getters if needed

}
