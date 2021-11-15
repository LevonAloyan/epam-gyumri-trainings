package pizzeria_palmetto;

public enum TypeOfPizza {
    BASE(1.0),
    CALZONE(0.5);

    double price;

    TypeOfPizza(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
