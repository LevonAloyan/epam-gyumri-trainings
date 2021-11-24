package pizza;

public enum PizzaType {
    REGULAR(1.0),
    CALZONE(1.5);

    private double price;
    PizzaType(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "PizzaType{" +
                "price=" + price +
                '}';
    }
}

