package pizzeria;

public class Invoice {
    public static void printCheck(Order order, PizzaType type, PizzaType price){
        System.out.println("\n" + "*************");
        System.out.println("\n" + "Order: " + order.getOrderNumber());
        System.out.println("\n" + "Client: " + order.getCustomer().getCustomerNumber());
        System.out.println("\n" + "-------------");
        System.out.println("\n" + PizzaType.class + " " + price);
        for (Ingredient ingredient : order.getIngredients()) {
            if(ingredient != null){
                System.out.println("\n" + ingredient.getName() + " " + "€");
            }else break;
        }
        System.out.println("--------------");
        System.out.println("Amount:" + " " + order.calculatePrice() + "€");
        System.out.println("Quantity:" + " " + order.getOrderItems());
        System.out.println("---------------");
        System.out.println("Total amount:" + " " + order.calculatePrice() + "€");
    }
}
