package pizzeria;

import java.util.Random;

public class Customer {

    private int customerNumber = 1000;
    private String customerName;
    private String phoneNumber;


    // todo implement necessary constructors
    // todo implement getters if needed

    public Customer (String customerName, String phoneNumber){
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this.customerNumber++;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

}
