package pizzeria;

public class Ingredient {

    private final String name;
    private final double price;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Ingredient getTomatoPaste() {
        return new Ingredient("Tomato Paste", 1);
    }

    public static Ingredient getCheese() {
        return new Ingredient("Cheese", 1);
    }

    // todo all ingredients
}
