package homework.pizzeriaPalmetto.model;

public enum Ingredients {

    TOMATO_PASTE(1),
    CHEESE(1),
    SALAMI(0.8),
    BACON(5),
    GARLIC(1.5),
    CORN(1),
    PEPPERONI(0.5),
    OLIVES(1);


    private double price;

    Ingredients(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
