package pizzeria;

public enum Ingredient {
    TOMATO_PASTA("TomatoPasta", 1),
    CHEESE("Cheese", 1),
    SALAMI("Salami", 1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic", 0.3),
    CORN("Corn", 0.7),
    PEPPERONI("Pepperoni", 0.6),
    OLIVES("Olives", 0.5);



    private final String name;
    private final double price;
    //private OrderItem[] orderItems;


    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public String toString() {
        return name + " " + price + " €\n";
    }
    // todo all ingredients
}
