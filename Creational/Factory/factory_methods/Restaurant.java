package Creational.Factory.factory_methods;
import Creational.Factory.products.Foods.Burger;
import Creational.Factory.products.Bevarages.Drink;

public abstract class Restaurant {
    protected abstract Burger createBurger();
    protected abstract Drink createDrink();

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("Burger is ready to be served.");
        return burger;
    }

    public Drink orderDrink() {
        Drink drink = createDrink();
        drink.serve();
        System.out.println("Drink is ready to be served.");
        return drink;
    }
}
