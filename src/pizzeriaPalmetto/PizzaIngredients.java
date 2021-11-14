package pizzeriaPalmetto;


public enum PizzaIngredients {
    Tomato_Paste(1),
    Cheese(1),
    Salami(1.5),
    Bacon(1.2),
    Garlic(0.3),
    Corn(0.7),
    Pepperoni(0.6),
    Olives(0.5),
    Peper(0.4),
    CALZONE(1.2),
    REGULAR(1);

    private final double tomato;
    private final double cheese;
    private final double salami;
    private final double bacon;
    private final double garlic;
    private final double corn;
    private final double pepperoni;
    private final double olives;
    private final double peper;
    private final double calzone;
    private final double regular;

    PizzaIngredients(double price) {
        this.tomato = price;
        this.cheese = price;
        this.salami = price;
        this.bacon = price;
        this.garlic = price;
        this.corn = price;
        this.pepperoni = price;
        this.olives = price;
        this.peper = price;
        this.calzone = price;
        this.regular = price;
    }

    public double getTomato() {
        return tomato;
    }

    public double getCheese() {
        return cheese;
    }

    public double getSalami() {
        return salami;
    }

    public double getBacon() {
        return bacon;
    }

    public double getGarlic() {
        return garlic;
    }

    public double getCorn() {
        return corn;
    }

    public double getPepperoni() {
        return pepperoni;
    }

    public double getOlives() {
        return olives;
    }
    public double getPeper() {
        return peper;
    }
    public double getCalzone() {
        return calzone;
    }

    public double getRegular() {
        return regular;
    }
}

