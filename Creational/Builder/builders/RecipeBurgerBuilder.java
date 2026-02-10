package Creational.Builder.builders;

import Creational.Builder.products.Manual;

public class RecipeBurgerBuilder implements BurgerBuilder {
    private final Manual manual = new Manual();
    
    @Override
    public void setType(String type) {
        manual.addLine("Burger Type: " + type);
    }

    @Override
    public void setBuns(int number) {
        manual.addLine("Number of Buns: " + number);
    }

    @Override
    public void setMeat(String meatType) {
        manual.addLine("Meat Type: " + meatType);
    }

    @Override
    public void addCheese() {
        manual.addLine("Includes Cheese");
    }

    @Override
    public void addVegatables() {
        manual.addLine("Includes Vegetables");
    }

    @Override
    public void addSauces() {
        manual.addLine("Includes Sauces");
    }

    public Manual getRecipe() {
        return manual;
    }
}
