package pizzeria;

public class Customer {

    private int customerNumber;
    private String name;



    // todo implement necessary constructors
    // todo implement getters if needed
    public Customer(String name) {
        this.name = name;
        this.customerNumber++;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public String newCustomer(int name){
        return this.name;
    }
}
