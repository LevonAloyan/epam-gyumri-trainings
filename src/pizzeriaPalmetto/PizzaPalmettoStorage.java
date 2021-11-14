package pizzeriaPalmetto;

public class PizzaPalmettoStorage {
    private Order[] orders;
    private Pizza[] pizzas;
    private int orderSize;
    private int pizzaSize;

    public PizzaPalmettoStorage(int capacity) {
        orders = new Order[capacity];
        pizzas = new Pizza[capacity];
    }

    public PizzaPalmettoStorage() {
        orders = new Order[16];
        pizzas = new Pizza[16];

    }

    public void addOrder(Order order) {
        if (orders.length == orderSize) {
            extendOrder();
        }
        orders[orderSize++] = order;
    }

    public void addPizza(Pizza pizza) {
        if (pizzas.length == pizzaSize) {
            extendPizza();
        }
        pizzas[pizzaSize++] = pizza;
    }

    private void extendPizza() {
        Pizza[] pizza = new Pizza[pizzas.length + 10];
        System.arraycopy(pizzas, 0, pizza, 0, pizza.length);
        pizzas = pizza;
    }

    private void extendOrder() {
        Order[] order = new Order[orders.length + 10];
        System.arraycopy(orders, 0, order, 0, orders.length);
        orders = order;
    }

    public void printCheck() {
        System.out.println("all information order name");

        for (int i = 0; i < orderSize; i++) {
            System.out.println(orders[i]);

        }
    }

    public void addIngredient(Ingredients ingredients) {

        System.out.println("please adde ingredient");
        for (int i = 0; i < pizzaSize; i++) {
            if (pizzas[i].getIngredients()==ingredients){
                System.out.println("this ingredient already exist");
            }

        }

    }
    public void pizzaArtribute(){

    }
}
