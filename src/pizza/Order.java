package pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Order {
    private int orderNumber;
    private int clientNumber;
    private List<String> ingredient;
    private PizzaType pizzaType;
    private String pizzaName;
    private int quantity;

    public Order(int clientNumber, String pizzName, int quantity, String pizzaType){
        Random order = new Random();
        this.orderNumber = order.nextInt(100000);
        this.clientNumber=clientNumber;
        this.pizzaName= checkOfName(pizzName);
        this.quantity=quantity;
        this.pizzaType= PizzaType.valueOf(pizzaType);
    }

    private String checkOfName(String pizzName) {
        String result=null;
        if(pizzName.length()>4 && pizzName.length()<20){result=pizzName;}
        else result="customer_name_n";

        return result;
    }

    public void displaying(){
        System.out.println("["+orderNumber+":"+clientNumber+":"+pizzaName+":"+quantity+"]");
    }

    void addIngredient(List<String> ingredient) {
        List<String> pizzaPlusIngredient = new ArrayList<>();
        //List<String> ingredientList=new ArrayList<String>(ingredientsMenu.keySet());
        for (int i = 0; i < ingredient.size(); i++) {
            for (int j = i+1; j < ingredient.size(); j++) {
                if(ingredient.get(i).equals(ingredient.get(j))){
                    System.out.println("This ingredient is dublicat "+ ingredient.get(i));
                }
            }
        }
        if (pizzaPlusIngredient.isEmpty()){

                pizzaPlusIngredient.addAll(ingredient);
                this.ingredient=ingredient;
        }
    }
   void printCheck(){
       System.out.println("****************************");
       System.out.println("Order:"+orderNumber);
       System.out.println("Client:"+clientNumber);
       System.out.println("Name:"+ pizzaName);
       System.out.println("----------------------------");
       System.out.println("Pizza Base"+pizzaType+" "+pizzaType.getDouble()+"€");
       for (int i = 0; i < ingredient.size(); i++) {
           System.out.println(ingredient.get(i)+" "+ingredientsMenu.get(ingredient.get(i))+" "+"€");
       }
       System.out.println("----------------------------");
       System.out.println("Amount "+amount(ingredient, pizzaType));
       System.out.println("Quantity "+quantity);

    }

     double amount (List<String> ingredient,PizzaType pizzaType ){
        double count =0;
         for (int i = 0; i < ingredient.size(); i++) {
             count = count+ingredientsMenu.get(ingredient.get(i));

         }
         count = count+pizzaType.getDouble();
         return count;
     }

       HashMap <String, Double> ingredientsMenu = new HashMap<>() {
           {
                put("TOMATO_PASTE", 1.0);
                put("CHEESE", 1.0);
                put("SALAMI", 1.5);
                put("BACON", 1.2);
                put("GARLIC", 0.3);
                put("CORN", 0.7);
                put("PEPPERONI", 0.6);
                put("OLIVES", 0.5);
            }

        };
        List<String> pizza = new ArrayList<>(){{
            add("MARGARITA");
            add("PEPPERONI");
            add("CHEESE");
            add("BASEPZZ");
            add("MEAT");
            add("MUSHROOM");
        }};







}
