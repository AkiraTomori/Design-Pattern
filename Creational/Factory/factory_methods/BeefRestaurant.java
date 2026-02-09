package Creational.Factory.factory_methods;
import Creational.Factory.products.Bevarages.Drink;
import Creational.Factory.products.Bevarages.Softdrink;
import Creational.Factory.products.Foods.BeefBurger;
import Creational.Factory.products.Foods.Burger;

public class BeefRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
    @Override
    protected Drink createDrink() {
        return new Softdrink();
    }
}
