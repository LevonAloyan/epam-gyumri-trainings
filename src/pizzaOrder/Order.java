package pizzaOrder;

import java.util.List;

public class Order {

    private static int orderId = 10000;
    private static int customerId = 0;
    private List<Pizza> items;

    public Order() {
        orderId++;
        customerId++;
    }

    public Order(List<Pizza> items) {
        orderId++;
        customerId++;
        this.items = items;
    }


    public void displayPizzaAttributes(Pizza pizza) {
        System.out.println("[" + orderId + ": " + customerId + ": " +
                pizza.getName() + ": " + pizza.getQuantity() + "]");
    }

    public void printCheck() {
        float totalAmount = 0F;
        System.out.print("*********************************" + "\n" + "Order: " + orderId + "\n" + "Client: " +
                customerId + "\n");
        for (int i = 0; i < items.size(); i++) {
            float amount = 0F;
            System.out.println("Name: " + items.get(i).getName() + "\n" + "---------------------" + "\n" +
                    "Pizza Base (Calzone)" + " " + items.get(i).getType().getPrice() + " €");
            for (int j = 0; j < items.get(i).getIngredients().size(); j++) {
                System.out.println(items.get(i).getIngredients().get(j).getName() +
                        " " + items.get(i).getIngredients().get(j).getPrice() + " €");
                amount += items.get(i).getIngredients().get(j).getPrice();
            }
            amount += items.get(i).getType().getPrice();
            System.out.println("---------------------" + "\n" + "Amount: " + amount + " €" + "\n" + "Quantity: " +
                    items.get(i).getQuantity() + "\n" + "---------------------");
            totalAmount += items.get(i).getQuantity() * amount;
        }
        System.out.print("Total Amount: " + totalAmount + " €" + "\n" + "*********************************");
    }

}


