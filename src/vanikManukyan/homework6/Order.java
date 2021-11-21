package vanikManukyan.homework6;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private List<PizzaOrderType> orderTypes;

    public Order(int id, String customerName, List<PizzaOrderType> orderTypes) {
        this.id = id;
        this.customerName = customerName;
        this.orderTypes = orderTypes;
    }

    public List<String> pizzaAttributes() {
        List<String> orderAttributes = new ArrayList<>();
        String st = "[" + id + ":" + customerName + ":";
        String orderByString = "";
        for (PizzaOrderType item : orderTypes) {
            orderByString = st + item.getName() + ":" + item.getQuantity()+"]";
        }
        orderAttributes.add(orderByString);
        return orderAttributes;
    }

    public String pizzaAttributes(String pizzaName) {
        String st = "[" + id + ":" + customerName + ":";
        for (PizzaOrderType item : orderTypes) {
            if (item.getName().equals(pizzaName)) {
                st+= item.getName() + ":" + item.getQuantity()+"]";
                break;
            }
        }
        return st;
    }

    public void printCheck(){
        double totalAmount  = 0;
        System.out.println("**************");
        System.out.println("Order:" + id);
        System.out.println("Client:" + customerName);

        for (PizzaOrderType item : orderTypes) {
            System.out.println("Name:"+item.getName());
            System.out.println("_____________");
            System.out.println("Pizza base(Calzone)" + item.getPizza().getCalzone() + " $");
            for(Ingredient ingredient : item.getPizza().getIngredients()){
                System.out.println(ingredient.getName()+" "+ingredient.getPrice()+ingredient.getCurrency());
            }
            System.out.println("_______________");
            System.out.println("Amount :" + item.getPizza().getAmount()+"$");
            System.out.println("Quantity: "+item.getQuantity());
            System.out.println("_______________");
            totalAmount += item.getPizza().getAmount() * item.getQuantity();

        }

        System.out.println("Total amount:" +totalAmount );
        System.out.println("*******************");
    }
}
