package pizzeria;

import java.security.PublicKey;

public enum Ingredients {

    TOMATO_PASTA("TomatoPasta", 1),
    CHEESE("Cheese", 1),
    SALAMI("Salami", 1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic", 0.3),
    CORN("Corn", 0.7),
    PEPPERONI("Pepperoni", 0.6),
    OLIVES("Olives", 0.5);


    private String name;
    private double price;

    Ingredients(String name, double price) {
        this.name = name;
        this.price = price;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toPriceString() {
        return this.name + " " + this.price + " €";
    }
}
