package Creational.Builder.products;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String name;
    private final List<String> ingredients = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void show() {
        System.out.println("Burger: " + name);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}
