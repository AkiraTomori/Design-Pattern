package Creational.Factory.factory_methods;
import Creational.Factory.products.Burger;
import Creational.Factory.products.ChickenBurger;

public class ChickenRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
    
}
