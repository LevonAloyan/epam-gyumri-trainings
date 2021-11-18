package pizzeria;

import java.security.PublicKey;

public class Ingredient {
    private final String name;
    private final double price;

    public Ingredient (String name,double price){
        this.name = name;
        this.price = price;
    }

    public static Object getPepperoni() {
        return null;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public  static Ingredient getTomatoPaste(){
        return new Ingredient("Tomato Pasta",1);
    }
    public  static Ingredient getCheese(){
        return new Ingredient("Cheese",1);
    }
    public static Ingredient getSalami(){
        return new Ingredient("Salami",1.5);
    }
    public static Ingredient getBacon(){
        return new Ingredient("Bacon",1.2);
    }
    public static Ingredient getGarlic(){
        return new Ingredient("Garlic",0.3);
    }
    public static Ingredient getCorn(){
        return new Ingredient("Corn",0.7);
    }
    public static Ingredient getPeperoni(){
        return new Ingredient("Peperoni",0.6);
    }
    public static Ingredient getOlives(){
        return new Ingredient("Olives",0.5);
    }

    @Override
    public String toString() {
        return  name +" "+ price +" €";
    }
}
