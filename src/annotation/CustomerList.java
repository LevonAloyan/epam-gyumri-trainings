package annotation;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customers = new ArrayList<Customer>();

    public void nameRange(){
        CustomerList ob = new CustomerList();
        Class<?> c = ob.getClass();
        try {
            String name  = ob.getClass().getName();
            if(name.length() > 2 && name.length() < 30){
                return;
            }
        }catch (IllegalArgumentException exc){
            System.out.println();
        }
    }
}
