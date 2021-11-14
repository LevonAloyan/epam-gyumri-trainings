package pizza;

import java.io.IOException;

public class CreatePizzaOrder {
    public static void main(String[] args) throws IOException {
        PizzaList piizzaList = new PizzaList();
        piizzaList.showPizzaIngredients();
        int[] selectedIngredients = piizzaList.inputChooseIngredients();
        boolean confirmedList = piizzaList.confirmIngredientsList(selectedIngredients);
        if (confirmedList){
            piizzaList.printCheck();
        }
    }
}
