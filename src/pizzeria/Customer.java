package pizzeria;
public class Customer {

    private int customerNumber;
    private String name;
    private String phoneNumber;

    // todo implement necessary constructors
    // todo implement getters if needed

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.customerNumber = getRandomId(10000, 99999);
        this.phoneNumber = phoneNumber;
    }

    public int getRandomId(int min, int max) {
       return  (int) (min + (Math.random() * (max-min)));


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
}
