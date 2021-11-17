package pizzeria;

import java.util.Arrays;

public class OrderItem {
    private Pizza pizza;
    private int count;
    private final String COUNT_IS_MORE = "You can take a maximum of 10 items";

    public  OrderItem(Pizza pizza,int count){
        this.pizza = pizza;
        this.count = countCheck(count);
    }

    public static OrderItem addOrderItem(Pizza pizza,int count){
        return new OrderItem(pizza,count);
    }

    public int countCheck(int count){
        this.count = count;
        if (count > 10 || count < 1){
            System.out.println(COUNT_IS_MORE);
            return 0;
        }
        return count;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCount() {
        return count;
    }

    public double calculateItemPrice(){
        double itemPrice = 0.0d;
        for (int i = 0; i < count; i++) {
            itemPrice += getPizza().calculatePrice();
        }
        return itemPrice;
    }

    public String toStringDescription(){

        return String.join("\n",
                getPizza().getPizzaType().toString(), Arrays.toString(getPizza().getIngredients()),
                "--------****-----------",
                 "Quantity :" + getCount(),
                "Amount :" + calculateItemPrice() + " $");

    }

}
