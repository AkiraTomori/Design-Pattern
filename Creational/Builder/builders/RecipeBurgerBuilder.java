package Creational.Builder.builders;

public class RecipeBurgerBuilder implements BurgerBuilder {
    private String recipe = "";
    
    @Override
    public void setType(String type) {
        recipe += "Burger Type: " + type + "\n";
    }

    @Override
    public void setBuns(int number) {
        recipe += "Number of Buns: " + number + "\n";
    }

    @Override
    public void setMeat(String meatType) {
        recipe += "Meat Type: " + meatType + "\n";
    }

    @Override
    public void addCheese() {
        recipe += "Includes Cheese\n";
    }

    @Override
    public void addVegatables() {
        recipe += "Includes Vegetables\n";
    }

    @Override
    public void addSauces() {
        recipe += "Includes Sauces\n";
    }

    public String getRecipe() {
        return recipe;
    }
}
