package stack;

public class Ordered extends Palmetto{
    int client;
    String customerName;
    String [] ingredients = new String[7];

    public Ordered () {
        super();
    }


    public static String getPizzaName(String Name, String customer) {
        System.out.println(Name.length());
        if (Name.length() > 4 && Name.length() < 20) {
            return Name;
        }
        else {
            return (customer + "_" + order);
        }
    }


    public void pizza (String pizzaName, type type, int quantity, int client, String customerName){
        getPizzaName(pizzaName, customerName);
        getQuantity(quantity);
        System.out.println("Client:" + client + ", pizzaName:" + pizzaName + ", pizza type:" + type + ", quantity:" + quantity + ".");
    }

    public void orderdAttribute (int client, String pizzaName, int quantity, String customerName) {
        getPizzaName(pizzaName, customerName);
        getQuantity(quantity);
        System.out.println("[" + order + ":" + client + ":" + pizzaName + ":" + quantity + "]");
    }

    


}
