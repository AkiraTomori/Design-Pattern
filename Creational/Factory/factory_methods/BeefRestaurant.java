package Creational.Factory.factory_methods;
import Creational.Factory.products.Burger;
import Creational.Factory.products.BeefBurger;

public class BeefRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
    
}
