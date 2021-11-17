package pizzeria;

public class TestPizza {

    public static void main(String[] args) {
        Pizza Italiano = Pizza.addPizza("Italiano", PizzaType.getRegularType(), Ingredient.getGarlic(),
                Ingredient.getSalami(), Ingredient.getTomatoPaste(), Ingredient.getCheese());
        Pizza Palmetto = Pizza.addPizza("Palmetto", PizzaType.getCalzoneType(), Ingredient.getBacon(),
                Ingredient.getCheese(), Ingredient.getSalami(), Ingredient.getTomatoPaste(), Ingredient.getGarlic(),
                Ingredient.getCorn());


        OrderItem orderItem=new OrderItem(Italiano, 1);
        OrderItem orderItem1=new OrderItem(Palmetto, 2);
        CheckPrinter.checkPrint(Order.addOrder(Customer.addCustomer("Samvel","098213399"),orderItem,orderItem1));


    }

}
