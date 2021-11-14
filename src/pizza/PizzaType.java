package pizza;

public enum PizzaType {
    REGULAR(1.0),
    CALZONE(1.5);

    private double value;
     PizzaType(double value){
        this.value=value;
    }
    public double getDouble(){
         return value;
    }
}
