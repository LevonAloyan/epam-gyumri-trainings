package pizzeriaPalmetto;

import java.util.Locale;
import java.util.Scanner;

public class PizzaPalmettoTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Pizza pizza;
    private static Order order;
    private static PizzaPalmettoStorage pizzaPalmettoStorage;

    public static void main(String[] args) {
        Boolean isRun = true;
        while (isRun) {
            int command;
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    addOrder();
                    break;
                case 2:
                 addIngredient();
                    break;
                case 3:
                    pizzaPalmettoStorage.printCheck();
                    break;
                case 4:
                   pizzaPalmettoStorage.pizzaArtribute();
                    break;
                case 5:
                    mainMenu();
                    break;


            }
        }


    }

    private static void mainMenu() {
    }

    private static void addIngredient() {
    }

    private static void addOrder() {
        String orderData = scanner.nextLine();
        System.out.println("pliase input cotumerNumber");
        order.setCotumerNumber(scanner.nextInt());
        System.out.println("pliase input orderNumber");

        order.setOrderNumber(scanner.nextInt());
        System.out.println("pliase input pizza");
        String pizzaName = scanner.nextLine();
        if (pizzaName.length() < 4 && pizzaName.length() > 20) {
            pizzaName = String.valueOf(order.getCotumerNumber() + order.getOrderNumber());
        }
            order.setPizza(new Pizza(pizzaName,PizzaType.valueOf(scanner.nextLine()),Ingredients.valueOf(scanner.nextLine()),3));


        }
        public void addIngredient (Ingredients ingredients){
            for (Ingredients ingredients1 : Ingredients.values()) {
                System.out.println(ingredients);
            }
            String ingredientsName = scanner.nextLine();
            Ingredients ingredients1 = Ingredients.valueOf(ingredientsName.toUpperCase(Locale.ROOT));

        }

    }


