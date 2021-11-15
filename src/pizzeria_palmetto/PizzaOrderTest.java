package pizzeria_palmetto;

public class PizzaOrderTest {
    public static void main(String[] args) {
    Order order1 = new Order(7717,"Margarita", 2, TypeOfPizza.CALZONE);
    order1.addIngredients(4);
    order1.displaying();
    order1.printCheck();
    Order order2 = new Order(4372,"BasePZZ", 12,TypeOfPizza.BASE);
    order1.addIngredients(8);
    order2.displaying();
    order2.printCheck();

//     Ingredients [] Margarita= Ingredients.values();
//        for (int i=0;i<Ingredients.values().length; i++){
//     System.out.println(Margarita[i]);}
//}
}}