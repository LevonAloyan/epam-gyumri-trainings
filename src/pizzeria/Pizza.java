package pizzeria;

public class Pizza {

    static String[] ingredientsList = {"Tomato Paste: 1.00", "Cheese: 1.00",
            "Salami: 1.50", "Bacon: 1.20", "Garlic: 0.30", "Corn: 0.70",
            "Pepperoni: 0.60", "Olives: 0.50"};

    private String pizzaName;
    private String type;
    private double price;
    private int count;
    //List
    private final String[] ingredient;
    private int pizzaNum;

    public Pizza() {
        this.price = 1.00;
        this.ingredient = new String[8];
    }

    public void setIngredient(String[] choiceIngredient) {
        int index = 0;
        for (String s : choiceIngredient) {
            if (s != null) {
                this.ingredient[index++] = s;
            }

        }
        calculatePrice();
    }

    private void calculatePrice() {
        double calculate = 1.00;
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] != null) {

                String temp = ingredient[i];
                double nextIngredient = Double.parseDouble(temp.substring(temp.length() - 4, temp.length()));
                calculate += nextIngredient;
            }
        }
        if (this.type.equalsIgnoreCase("Calzone")) {
            calculate += 0.50;
        }
        this.price = calculate;
    }

    public int checkIngredientList() {
        int freeSize = 0;
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == null) {
                freeSize++;
            }
        }
        if (freeSize == 0) {
            System.out.println("Список ингредиентов заполнен");
        } else {
            System.out.println("Вы можете добавить " + freeSize + " ингредиентов");
        }
        return freeSize;
    }

    public void addIngredient(String[] newIngredient, int freeSize) {
        int index = ingredient.length - freeSize;
//        System.out.println("before " + Arrays.toString(ingredient));
//        System.out.println("newIngredient " + Arrays.toString(newIngredient));


        for (int i = 0; i < newIngredient.length; i++) {
            if (newIngredient[i] != null) {
                ingredient[index++] = newIngredient[i];
            }


        }
        calculatePrice();
//        System.out.println("after " + Arrays.toString(ingredient));
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPizzaNum() {
        return pizzaNum;
    }

    public void setPizzaNum(int pizzaNum) {
        this.pizzaNum = pizzaNum;
    }


    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {

        this.pizzaName = pizzaName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }


    public String[] getIngredient() {
        return ingredient;
    }

}
