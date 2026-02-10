package Creational.Builder.director;
import Creational.Builder.builders.BurgerBuilder;

public class Director {
    public void constructBigMac(BurgerBuilder builder) {
        builder.setType("Big Mac");
        builder.setBuns(3);
        builder.setMeat("Beef");
        builder.addCheese();
        builder.addVegatables();
        builder.addSauces();
    }

    public void constructChickenBurger(BurgerBuilder builder) {
        builder.setType("Chicken Burger");
        builder.setBuns(2);
        builder.setMeat("Chicken");
        builder.addVegatables();
        builder.addSauces();
    }

    public void constructRecipe(BurgerBuilder builder) {
        builder.setType("Recipe Burger");
        builder.setBuns(2);
        builder.setMeat("Mixed");
        builder.addCheese();
        builder.addVegatables();
        builder.addSauces();
    }
}
