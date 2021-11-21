package vanikManukyan.homework6;

import java.util.Set;

public enum Menu {
    MARGARITA("Margarita", Set.of(new Ingredient("", 5, ""),new Ingredient("", 5, ""))),
    PepperoniOro("PepperoniOro", Set.of(new Ingredient("", 5, ""))),
    BasePZZ("BasePZZ", Set.of(new Ingredient("", 5, "")));

    private String name;
    private Set<Ingredient> ingredients;

    Menu(String name, Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
        this.name = name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
