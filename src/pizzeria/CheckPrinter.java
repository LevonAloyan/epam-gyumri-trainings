package pizzeria;

public class CheckPrinter {

    public CheckPrinter(Order order){

    }

    public static void printCheck(Order order){
        double totalPrice = 0;
        System.out.println("Order: " + order.orderNumber);
        System.out.println("Client: " + order.getCustomerNumber());

        for(OrderItem item: order.getOrderItems()){
            System.out.println("Name: " + item.getPizza().getName());
            System.out.println("-------------------");
            System.out.println("Pizza Base " + item.getPizza().getPizzaType().getName()
                    + " " + item.getPizza().getPizzaType().getPrice() + " €");

            Ingredient[] ingredientsToPrint = item.getPizza().getIngredients();
            for (int i = 0; i < ingredientsToPrint.length; i++){
                System.out.println(ingredientsToPrint[i].getName() + " "
                        + ingredientsToPrint[i].getPrice() + " €");
            }

            System.out.println("-------------------");
            System.out.println("Amount: " + item.getPizza().calculatePrice() + " €");
            totalPrice += item.getPizza().calculatePrice();

            System.out.println("Quantity: " + item.getCount());

            System.out.println("-------------------");

        }
        System.out.println("Total " + totalPrice + " €");
    }
}
