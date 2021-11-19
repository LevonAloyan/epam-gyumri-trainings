package pizzeria;

public enum Ingredient {

    TOMATO_PASTE("Tomato_paste",1),
    CHEESE("Cheese",1),
    SALAMI("Salami",1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic",0.3),
    CORN("Corn", 0.7),
    PEPPERONI("Peperoni",0.6),
    OLIVES("Olives",0.5);

    private final double price;
    private final String name;

    Ingredient(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName () {
        return name;
    }

}