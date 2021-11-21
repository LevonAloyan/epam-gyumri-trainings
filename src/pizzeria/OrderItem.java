package pizzeria;

public class OrderItem {
    private Pizza pizza;
    private int pizzaCty;

    public OrderItem (Pizza pizza, int pizzaCty){
        this.pizza = pizza;
        this.pizzaCty = checkQuantityPizza(pizzaCty);
    }

    public int checkQuantityPizza(int pizzaCty) {
        if (pizzaCty > 0  && pizzaCty <= 10) {
            return pizzaCty;
        }
        return 0;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getPizzaCty() {
        return pizzaCty;
    }

    public double calculatePrice() {
        double price = 0.0;
        for (int i = 0; i < pizzaCty; i++) {
            price += getPizza().calculatePrice();
        }
        return price;
    }
}
