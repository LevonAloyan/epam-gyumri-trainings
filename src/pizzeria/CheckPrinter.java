package pizzeria;

public class CheckPrinter {

    // implement print check method
    public static void main(String[] args) {
        Customer customer = new Customer("Hayk", "+37455664464");
        Ingredient[] ingredients = new Ingredient[2];
        ingredients[0] = Ingredient.getBacon();
        ingredients[1] = Ingredient.getCorn();
        OrderItem[] orderItem = new OrderItem[1];
        orderItem[0] = new OrderItem(new Pizza("test", PizzaType.getCalzoneType(),ingredients), 4);

        CheckPrinter.checkPrint(new Order(customer, orderItem));
    }

    public static void checkPrint(Order order) {
        System.out.println("**************************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
        System.out.println("Client Name: " + order.getCustomer().getName());
        System.out.println("Client Phone: " + order.getCustomer().getPhoneNumber());
        System.out.println("--------------------------------------");

        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println( "Pizza name: " + orderItem.getPizza().getName() );
            System.out.println( "Quantity: " + orderItem.getPizzaCty());
            System.out.println("Pizza type: " + orderItem.getPizza().getPizzaType().getType());
            for (Ingredient ingredient : orderItem.getPizza().getIngredients()){
                System.out.println(ingredient.getName());
            }
            System.out.println("--------------------------------------");
        }
        System.out.println("Total amount: " + order.orderPrice() + " $");
        System.out.println("**************************************");
    }


}
