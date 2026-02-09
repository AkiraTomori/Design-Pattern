package Creational.Factory.factory_methods;
import Creational.Factory.products.Burger;

public abstract class Restaurant {
    protected abstract Burger createBurger();

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
}
