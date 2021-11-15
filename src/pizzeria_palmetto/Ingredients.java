package pizzeria_palmetto;

public enum Ingredients {
    TOMATOPASTE(1.0),
    CHEESE(1.0),
    SALAMI(1.5),
    BACON(1.2),
    GARLIC(0.3),
    CORN(0.7),
    PEPPERONI(0.6),
    OLIVES(0.5);

    double price;

    Ingredients(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
