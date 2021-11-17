package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerStorage {

    List<Customer> customers = new ArrayList<>();

    public static  int generateNumber(){
        Random random = new Random();
        return ((1 + random.nextInt(2)) * 10000 + random.nextInt(10000));
    }

    public void addCustomer(Customer customer) {
        int customerNumber = generateNumber();
        for (Customer customerInList : customers) {
            if (customerInList.getCustomerNumber() == customerNumber) {
                break;
            } else {
                customer.setCustomerNumber(customerNumber);
                customers.add(customer);
            }
        }
    }

    public Customer getByNumber(int number) {
        for (Customer customer : customers) {
            if (customer.getCustomerNumber() == number)
                return customer;
        }
        return null;
    }






}
