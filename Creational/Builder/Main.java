package Creational.Builder;

import Creational.Builder.builders.*;
import Creational.Builder.director.Director;
import Creational.Builder.foods.Burger;
import Creational.Builder.base.BurgerOld;
public class Main {
    public static void main(String []agrs) {

        // Before Builder Pattern
        BurgerOld burger1 = new BurgerOld("Basic Burger", 2, "Beef");
        BurgerOld burger2 = new BurgerOld("Cheese Burger", 2, "Beef", true);
        System.out.println("--- Old Burger ---");
        burger1.show();
        burger2.show();
        // After Builder Pattern
        Director director = new Director();

        EatenBurgerBuilder eatenBurgerBuilder = new EatenBurgerBuilder();
        director.constructBigMac(eatenBurgerBuilder);
        System.out.println("--- Eaten Burger ---");
        Burger bigmac = eatenBurgerBuilder.getResult();
        bigmac.show();


        RecipeBurgerBuilder recipeBurgerBuilder = new RecipeBurgerBuilder();
        director.constructRecipe(recipeBurgerBuilder);
        System.out.println("--- Recipe Burger ---");
        String recipe = recipeBurgerBuilder.getRecipe();
        System.out.println(recipe);
    }
}
