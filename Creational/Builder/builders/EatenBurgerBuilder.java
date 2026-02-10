package Creational.Builder.builders;

import Creational.Builder.products.Burger;

public class EatenBurgerBuilder implements BurgerBuilder {
    private Burger burger = new Burger();
    
    @Override
    public void setType(String type) {
        burger.setName(type);
    }
    
    @Override
    public void setBuns(int number) {
        burger.addIngredient(number + " Buns");
    }

    @Override
    public void setMeat(String meatType) {
        burger.addIngredient("Meat: " + meatType);
    }

    @Override
    public void addCheese() {
        burger.addIngredient("Cheese");
    }

    @Override
    public void addVegatables() {
        burger.addIngredient("Lettuce, Tomato, Onions");
    }
    @Override
    public void addSauces() {
        burger.addIngredient("Ketchup, Mustard");
    }

    public Burger getResult() {
        return burger;
    }
}
