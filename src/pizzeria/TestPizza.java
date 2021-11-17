package pizzeria;

public class TestPizza {


    public static void main(String[] args) {

            Pizza Calzone = Pizza.addPizza("Calzone", PizzaType.getCalzoneType(),Ingredient.getGarlic(),
                    Ingredient.getBacon(), Ingredient.getOlives(), Ingredient.getCheese());
//        for (Ingredient ingredient : Calzone.getIngredients()) {
//            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
//        }
            Pizza Margarita = Pizza.addPizza("Margarita", PizzaType.getRegularType(),  Ingredient.getCheese(),
                    Ingredient.getBacon(), Ingredient.getSalami(), Ingredient.getTomatoPaste());
        for (Ingredient ingredient : Margarita.getIngredients()) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }

            Customer customer = new Customer("Alina", " ");
            OrderItem orderItem = new OrderItem(Calzone, 10);
            OrderItem orderItem1 = new OrderItem(Margarita, 3);

            CheckPrinter.checkPrint(Order.addOrder(customer,orderItem,orderItem1));

        }

    }
