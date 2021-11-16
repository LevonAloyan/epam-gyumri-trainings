package pizzeria;

public enum Ingredients {
    TOMATO_PASTE("Tomato_paste",1),
    CHEESE("Cheese",1),
    SALAMI("Salami",1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic",0.3),
    CORN("Corn", 0.7),
    PEPPERONI("Peperoni",0.6),
    OLIVES("Olives",0.5),
    CALZONE("Calzone", 1.50),
    REGULAR("Regular",1);

    private final double price;
    private final String name;

    Ingredients(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getNameAndPrice () {
        return name + " " + price + " €";
    }


}
