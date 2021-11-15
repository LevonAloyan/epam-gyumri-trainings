package pizza;


import java.util.Scanner;

public class Pizza {

    Scanner scanner = new Scanner(System.in);

    private String[] ingredients = new String[9];
    private final double regular = 1.0;
    private final double calzone = 0.5;
    private final double tomatoPaste = 1.5;
    private final double cheese = 1.0;
    private final double salami = 1.5;
    private final double bacon = 1.2;
    private final double garlic = 0.3;
    private final double corn = 0.7;
    private final double pepperoni = 0.6;
    private final double olives = 0.5;
    private double coast = 0;

    private String pizzaName;
    private String customerName;
    private int orderNum;
    private int quantity;



    public Pizza() {
    }

    public Pizza(String pizzaName, String customerName, int orderNum, int quantity) {
        setPizzaName(pizzaName);
        setCustomerName(customerName);
        this.orderNum=orderNum;
        this.quantity = quantity;
    }


    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            orderNum++;
            this.pizzaName = "Customer_name_" + orderNum;
        } else {
            this.pizzaName = pizzaName;
        }
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.isBlank()) {
            int name = (int) (1000 + (Math.random() * 1000));
            this.customerName = String.valueOf(name);
        } else {
            this.customerName = customerName;
        }
    }


    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum() {
        this.orderNum = (int) (10000 + (Math.random() * 1000));
    }


    public String[] addIngredints() {
        ingredients = this.ingredients;
        chooseBase();
        String addedIngredient;

        for (int i = 1; i < ingredients.length; i++) {
            if (i == ingredients.length) {
                System.out.println("The ingredients for pizza are filled.");
            }
            System.out.println("Add ingredients or input 'finish' to end: ");
            addedIngredient = scanner.nextLine();
            if (addedIngredient.equalsIgnoreCase("Finish")) {
                return ingredients;
            } else if (addedIngredient.equalsIgnoreCase("Tomato paste") ||
                    addedIngredient.equalsIgnoreCase("Cheese") ||
                    addedIngredient.equalsIgnoreCase("Salami") ||
                    addedIngredient.equalsIgnoreCase("Bacon") ||
                    addedIngredient.equalsIgnoreCase("Garlic") ||
                    addedIngredient.equalsIgnoreCase("Corn") ||
                    addedIngredient.equalsIgnoreCase("Pepperoni") ||
                    addedIngredient.equalsIgnoreCase("Olives")) {
                if (ingredients[i - 1].equalsIgnoreCase(addedIngredient)) {
                    System.out.println("You have already added " + addedIngredient + " on pizza, choose sth different ");
                    i--;
                    System.out.println("Add ingredients: ");
                    addedIngredient = scanner.nextLine();
                } else {
                    ingredients[i] = addedIngredient;
                }
            } else {
                System.out.println("No such ingredient.");
                i--;
                System.out.println("Add ingredients: ");
                addedIngredient = scanner.nextLine();
            }
        }
        return ingredients;
    }

    public double calculatePrice() {
        this.ingredients = ingredients;
        String value;
        int i = 0;

        while ((ingredients.length > i) && !(ingredients[i]).isEmpty()) {
            value = ingredients[i];
            switch (value) {
                case "regular":
                    coast += regular;
                    break;
                case "calzone":
                    coast += calzone;
                    break;
                case "tomato paste":
                    coast += tomatoPaste;
                    break;
                case "cheese":
                    coast += cheese;
                    break;
                case "salami":
                    coast += salami;
                    break;
                case "bacon":
                    coast += bacon;
                    break;
                case "garlic":
                    coast += garlic;
                    break;
                case "corn":
                    coast += corn;
                    break;
                case "pepperoni":
                    coast += pepperoni;
                    break;
                case "olives":
                    coast += olives;
                    break;
                default:
            }
        }
        return (double) coast;
    }

    private String[] chooseBase() {
        this.ingredients = ingredients;
        System.out.println("Choose base for pizza, regular or calzone: ");
        String addedBase = scanner.nextLine();

        if (addedBase.equalsIgnoreCase("Regular") || (addedBase.equalsIgnoreCase("Calzone"))) {
            ingredients[0] = addedBase;
        } else {
            System.out.println("You entered incorrect input.");
            chooseBase();
        }
        return ingredients;
    }


    public int setQuantity(int quantity) {
        if (quantity > 10) {
            System.out.println("Quantity cant be more then 10");
            return this.quantity = 10;
        } else {
            return this.quantity = quantity;
        }
    }



    public void displayAttributes() {
        System.out.println("Order: Customer: Name: Quantity");
        System.out.println("[" + orderNum + ":" + customerName + ":" + pizzaName + ":" + quantity + "]");
    }

    public void printCheck() {
        System.out.println("***********************");
        System.out.println("Order: " + this.orderNum + "\n"
                + "Client: " + this.customerName + "\n"
                + "Name: " + this.pizzaName + "\n");

    }

}
