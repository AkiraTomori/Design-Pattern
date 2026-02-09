package Creational.Factory.bases;
import Creational.Factory.products.*;

public class SimpleRestaurant {
    public Burger orderBurger(String type) {
        Burger burger;
        if (type.equalsIgnoreCase("Beef")) {
            burger = new BeefBurger();
        }
        else if (type.equalsIgnoreCase("Chicken")) {
            burger = new ChickenBurger();
        }
        else {
            throw new IllegalArgumentException("Unknown burger type: " + type);
        }
        burger.prepare();
        return burger;
    }
}
