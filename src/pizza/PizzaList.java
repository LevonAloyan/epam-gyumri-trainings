package pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PizzaList {
    public String[][] list = {
            {"1.Tomato paste:", " 1"},
            {"2.Cheese:", " 1"},
            {"3.Salami:", " 1.5"},
            {"4.Bacon:", " 1.2"},
            {"5.Garlic:", " 0.3"},
            {"6.Corn:", " 0.7"},
            {"7.Pepperoni:", " 0.6"},
            {"8.Olives", " 0.5"}
    };
    public String[][] createdPizzas;
    public int[][] selectedIngredients;
    private int orderCount = 0;
    public void showPizzaIngredients(){
        for (int i = 0; i < this.list.length; i++ ){
            for (int j = 0; j < this.list[i].length; j++){
                System.out.print(this.list[i][j]);
            }
            System.out.println(" ");
        }
    }
    public int[] inputChooseIngredients () throws IOException{
        int[][] selectedIngredients = new int[this.orderCount + 1][7];
        for (int i = 0; i < this.orderCount; i++){
            selectedIngredients[i] = this.selectedIngredients[i];
        }
        this.selectedIngredients = selectedIngredients;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write ingredient by number(max ingredients count are 7). Write 'Stop' if you finished:");

        for (int i = 0; i < this.selectedIngredients[this.orderCount].length; i++) {
            System.out.print("Enter ingredient number: ");
            String b = br.readLine().toLowerCase();
            try {
                int number = Integer.parseInt(b);
                if(number > 0 & number <= this.selectedIngredients[this.orderCount ].length ){
                    if(!Arrays.stream(this.selectedIngredients[this.orderCount ]).anyMatch(x -> x == number)){
                        this.selectedIngredients[this.orderCount][i] = number;
                    }else {
                        i--;
                        System.out.println("Your selected ingredient already exists.");
                    }
                }else {
                    i--;
                    System.out.println("Your selected ingredient isn't exists");
                }

            } catch(NumberFormatException nfe) {
                if(b.equals("stop")) {
                    break;
                }else {
                    System.err.println("Invalid Format!");
                    i--;
                }
            }
        }
        return this.selectedIngredients[this.orderCount];
    }

    public boolean confirmIngredientsList(int[] selectedIngredients) throws IOException{
        System.out.println("\n Confirm your ingredients(Y/N)");
        for (int i = 0; i < selectedIngredients.length; i++){
            if(selectedIngredients[i] != 0) {
                for (int j = 0; j < this.list[selectedIngredients[i] - 1].length ; j++) {
                    System.out.print(this.list[selectedIngredients[i] - 1][j]);
                }
                System.out.println(" ");
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your answer(Y/N): ");
        String answer = br.readLine().toLowerCase();
        if (answer.equals("y")){
            this.orderCount++;
            createOrder(this.orderCount);
            return true;
        }else {
            showPizzaIngredients();
            confirmIngredientsList(inputChooseIngredients());
            printCheck();
        }
        return false;

    }
    public  void  createOrder(int count) throws IOException{
        String[][] createdPizzas = new String[count][6];
        for(int i = 0; i < count -1; i++){
            createdPizzas[i] = this.createdPizzas[i];
        }
        int max = 10000;
        int min = 1000;
        int rand = (int)(Math.random() * (max - min + 1) + min);
        createdPizzas[count-1][0] = "" + rand;
        createdPizzas[count-1][1] = userName();
        createdPizzas[count-1][2] = createPizzaName(Integer.toString(rand));
        createdPizzas[count-1][3] = countPizza().toString();
        createdPizzas[count-1][4] = "" + (count - 1);
        createdPizzas[count-1][5] = typePizza();
        this.createdPizzas = createdPizzas;
    }
    public String createPizzaName(String orderNumber) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write pizza name: ");
        String pizzaName = br.readLine();
        if (pizzaName.length() < 4 | pizzaName.length() > 20) {
            pizzaName = "ustomer_name_" + orderNumber;
        }
        return pizzaName;
    }
    public String userName() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your name: ");
        String userName = br.readLine();
        return userName;
    }
    public Number countPizza() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write count: ");
        String countPizza = br.readLine();
        try {
            int cty = Integer.parseInt(countPizza);
            if( cty > 0){
                return cty;
            }else {
                countPizza();
            }
        } catch(NumberFormatException nfe) {
            countPizza();
        }
        return 1;
    }
    public String typePizza()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pizza type is regular(1) or closed(2)?: ");
        String typePizza = br.readLine();
        try {
            int type = Integer.parseInt(typePizza);
            if( type == 1){
                return "1";
            }else if(type == 2){
                return "1.5";
            }else {
                typePizza();
            }
        } catch(NumberFormatException nfe) {
            typePizza();
        }
        return typePizza;
    }
    public void printCheck()throws IOException {
        for (int i = 0; i < this.createdPizzas.length; i ++) {
            double sum = 0;
            System.out.println("********************************");
            System.out.println("Order: " + this.createdPizzas[i][0]);
            System.out.println("Client: " + this.createdPizzas[i][1]);
            System.out.println("Name: " + this.createdPizzas[i][2]);
            System.out.println("________________________________");
            System.out.println("Pizza Base (Calzone)" + this.createdPizzas[i][5]);
            sum += Double.parseDouble(this.createdPizzas[i][5]);
            int[] newArray = this.selectedIngredients[Integer.parseInt(this.createdPizzas[i][4])];
            for (int j = 0; j < newArray.length; j++){
                if(newArray[j] != 0) {
                    for (int k = 0; k < this.list[newArray[j]].length; k++) {
                        System.out.print(this.list[newArray[j]][k]);
                    }
                    sum += Double.parseDouble(this.list[newArray[j]][1]);
                    System.out.println(" ");
                }
            }
            System.out.println("________________________________");

            System.out.println("Amount: " + sum + "$");
            System.out.println("Quantity: " + this.createdPizzas[i][3]);
            System.out.println("Total amount: " + (Double.parseDouble(this.createdPizzas[i][3]) * sum) + "$");
        }
        newOrder();
    }
    public void newOrder()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Create new Order(Y/N): ");
        String newOrder = br.readLine().toLowerCase();
        if(newOrder.equals("y")){
            showPizzaIngredients();
            if (confirmIngredientsList(inputChooseIngredients())){
                printCheck();
            }else {
                System.out.println("Bay Bay");
            }
        }else {
            System.out.println("Bay Bay");
        }
    }
}