package pizzeria;

public class Customer {

    private int customerNumber;
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerNumber = getRandomId(1000,9999);
    }
    public static Customer addCustomer(String name, String phoneNumber) {
        return new Customer(name, phoneNumber);

    }
    public int getRandomId(int min, int max){
        return (int)((Math.random()*(max-min))+min);
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

