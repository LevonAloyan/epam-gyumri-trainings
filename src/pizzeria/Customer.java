package pizzeria;

import java.util.Random;

public class Customer {

    private int customerNumber;
    private String name;
    private String phoneNumber;


    public Customer(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerNumber = generateCustomerNumber();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getCustomerNumber(){
        return this.customerNumber;
    }

    private Integer generateCustomerNumber(){
        Random random = new Random();
        return random.nextInt(10) * 1000 + random.nextInt(9000);
    }

    public static Customer addCustomer(String name, String phoneNumber){
        return new Customer(name, phoneNumber);
    }

}
