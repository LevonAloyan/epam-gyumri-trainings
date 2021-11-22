package pizzeria;

public enum Ingredient {
    TOMATO_PASTA("Tomato pasta", 1),
    CHEESE("Cheese", 1),
    SALAMI("Salami", 1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic", 0.3),
    CORN("Corn", 0.7),
    PEPPERONI("Pepperoni", 0.6),
    OLIVES("Olives", 0.5);

    private String name;
    private double prise;

    Ingredient(String name,double prise){
        this.name=name;
        this.prise=prise;
    }

    public String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }
}
