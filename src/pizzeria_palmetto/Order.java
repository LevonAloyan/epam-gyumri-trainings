package pizzeria_palmetto;

import java.util.Random;
import java.util.Scanner;

public  class Order {
    private static int orderNumber;
    private static int customerNumber;
    private static String pizzaName;
    private TypeOfPizza typeOfPizza;
    private Ingredients ingredients;
    private static int quantity;
    private static int localTime;


//    @Override
//    public String toString() {
//        return "Order [" +
//                "Order number() = " + orderNumber +
//                ", Customer number = " + customerNumber +
//                ", Pizza name () = "+ pizzaName +
//                ", Ingredients = "+ ingredients +
//                ", Type of pizza = "+ typeOfPizza+
//                ", Quantity = " + quantity+
//                ", Local time = " + localTime + "]";
//
//    }

    public Order( int customerNumber, String pizzaName, int quantity, TypeOfPizza typePizza) {
        Random order = new Random();
        this.orderNumber=order.nextInt(100000);
        this.customerNumber = customerNumber;
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.typeOfPizza = typePizza;
        this.localTime = 10;
    }

    public int getOrderNumber() {
            return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getPizzaName() {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            System.out.println("customer_name_" + "getOrderNumber()");
        }
        return pizzaName;
    }

    public TypeOfPizza getTypeOfPizza() {
        return typeOfPizza;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public int getQuantity() {
        if (quantity > 11) {
            System.out.println("You can order a maximum of 10 pizzas");
        }
        return quantity;
    }

    public  int getLocalTime() {
        return localTime;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setTypeOfPizza(TypeOfPizza typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static void displaying() {
        System.out.println("\n Pizza attributes - [ " + orderNumber + ": " + customerNumber+ ": " +  pizzaName + ": "
                + quantity + ": " + localTime + " minutes" + "]\n");
    }

    public static void addIngredients(int i){
        System.out.println("Add ingredients" );
        Ingredients add [] = {Ingredients.TOMATOPASTE, Ingredients.GARLIC,Ingredients.BACON,Ingredients.PEPPERONI,Ingredients.TOMATOPASTE,
        Ingredients.CHEESE, Ingredients.OLIVES,Ingredients.SALAMI};
     if(i==4){
        for (int j=0; j<i; j++){
           System.out.println(add[j]);
        }}
        for (int j=4; j<i; j++){
            System.out.println(add[j]);
        }
    }

    public void amount() {
        double Count = 0;
        Count =  typeOfPizza.getPrice();
        System.out.println(Count);
    }

    public void printCheck() {
        System.out.println("************************");
        System.out.println("Order: " + getOrderNumber());
        System.out.println("Client: " + getCustomerNumber());
        System.out.println("Name: " + getPizzaName());
        System.out.println("---------------------------------");
        System.out.println("Pizza " + getTypeOfPizza() + " " + typeOfPizza.getPrice() + "€");
       // System.out.println( ingredients.getPrice() +  " €");
        System.out.println("------------------------------------");
        System.out.print("Amount: ");
        amount();
        System.out.println("Quantity: " + getQuantity());
    }
}
