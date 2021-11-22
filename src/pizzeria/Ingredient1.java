package pizzeria;

enum Ingredient1 {

    TOMATO_PASTE(1),
    CHEESE(1),
    SALAMI(1.5),
    BACON(1.5),
    GARLIC(0.3),
    CORN(0.3),
    PEPPERONI(0.6),
    OLIVES(0.5);


    private double price;


    Ingredient1(double price) {

        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
