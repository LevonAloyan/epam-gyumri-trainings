package pizzeria;

public enum PizzaType {

    REGULAR("Regular",1),
    CALZONE("Calzone",1.5);


    String name;
    double price;



    PizzaType(String name, double price) {
        this.name =name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Pizza Base:" + " " + name + " " + price + "$";
    }
}
