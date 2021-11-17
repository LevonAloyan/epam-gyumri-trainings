package palmetto;

public class PizzaType {
    private final String type;
    private double price;

    public PizzaType(String type, double delta) {
        this.price = price + delta;
        this.type = type;
    }
    public double getPrice() {
        return price;
    }

    public static PizzaType getRegularType(){
        return new palemettoCoppy.PizzaType("Regular", 0);
    }
    public static palemettoCoppy.PizzaType getCalzoneType(){
        return new palemettoCoppy.PizzaType("Calzone", 0.5);
    }
}
