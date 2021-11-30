package pizzeria;

public class Invoice {
    public static void printCheck(Order order, Pizza pizza, PizzaType pizzaType, OrderItem orderItem){
        double totalAmount = 0.0d;
        {
            System.out.println("*******************");
            System.out.println("Order: " + order.getOrderNumber());
            System.out.println("Client: " + Customer.getCustomerNumber());
            System.out.println("Name: " + pizza.pizzaName);
            System.out.println("-------------------");
            System.out.println("Pizza Base" + "(" + pizzaType.getType() + ") " + pizzaType.getPrice() + " €");
            double amount = 0.0d + pizzaType.getPrice();
            for (Ingredient ingredient : pizza.getIngredients()) {
                if (ingredient != null) {
                    System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "€");
                    amount += ingredient.getPrice();
                } else break;
            }
            System.out.println("--------------");
            System.out.println("Amount: " + amount + "€");
            System.out.println("Quantity: " + orderItem.getQuantity());
            System.out.println("---------------");
            totalAmount += orderItem.getQuantity() * amount;
        }
        System.out.println("Total amount:" + totalAmount + " " + "€");
    }
}
