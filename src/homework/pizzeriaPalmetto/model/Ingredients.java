package homework.pizzeriaPalmetto.model;

public enum Ingredients {

    TOMATO_PASTE(1,"Tomato paste"),
    CHEESE(1,"Cheese"),
    SALAMI(0.8,"Salami"),
    BACON(5,"Bacon"),
    GARLIC(1.5,"Garlic"),
    CORN(1,"Corn"),
    PEPPERONI(0.5,"Pepperoni"),
    OLIVES(1,"Olives");


    private double price;
    private String name;



    Ingredients(double price,String name){
        this.price = price;
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}
