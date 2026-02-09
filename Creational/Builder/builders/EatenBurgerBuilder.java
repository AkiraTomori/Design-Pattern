package Creational.Builder.builders;

import Creational.Builder.foods.Burger;

public class EatenBurgerBuilder implements BurgerBuilder {
    private Burger result = new Burger();
    
    @Override
    public void setType(String type) {
        result.setName(type);
    }
    
    @Override
    public void setBuns(int number) {
        result.addIngredient(number + " Buns");
    }

    @Override
    public void setMeat(String meatType) {
        result.addIngredient("Meat: " + meatType);
    }

    @Override
    public void addCheese() {
        result.addIngredient("Cheese");
    }

    @Override
    public void addVegatables() {
        result.addIngredient("Lettuce, Tomato, Onions");
    }
    @Override
    public void addSauces() {
        result.addIngredient("Ketchup, Mustard");
    }

    public Burger getResult() {
        return result;
    }
}
