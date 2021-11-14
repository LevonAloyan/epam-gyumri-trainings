package vanikManukyan.homework6;

import java.util.Set;

public class Pizza {
    private Set<Ingredient> ingredients;
     private double calzone;

    public Pizza(Set<Ingredient> ingredients, double calzone) {
        this.ingredients = ingredients;
        this.calzone = calzone;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getCalzone() {
        return calzone;
    }

    public void setCalzone(double calzone) {
        this.calzone = calzone;
    }

    public double getAmount() {
        double amount = 0;
        for (Ingredient item : ingredients) {
            amount += item.getPrice();
        }
        amount += calzone;
        return amount;
    }



    public boolean addIngredients(Ingredient ingredient) {
        return ingredients.add(ingredient);
    }

    public void removeIngredients(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }
}
