package pizzeria;

public class TestPizza {

    public static void main(String[] args) {
        Pizza Italiano = Pizza.addPizza("Italiano", PizzaType.REGULAR, Ingredient.GARLIC,
                Ingredient.SALAMI, Ingredient.TOMATOPASTE, Ingredient.CHEESE);
        Pizza Palmetto = Pizza.addPizza("Palmetto", PizzaType.CALZONE, Ingredient.BACON,
                Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATOPASTE, Ingredient.GARLIC,
                Ingredient.CORN);


        OrderItem orderItem=new OrderItem(Italiano, 1);
        OrderItem orderItem1=new OrderItem(Palmetto, 2);
        CheckPrinter.checkPrint(Order.addOrder(Customer.addCustomer("Samvel","098213399"),orderItem,orderItem1));


    }

}
