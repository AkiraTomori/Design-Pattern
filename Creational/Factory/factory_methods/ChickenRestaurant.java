package Creational.Factory.factory_methods;
import Creational.Factory.products.Bevarages.Drink;
import Creational.Factory.products.Bevarages.MilkTea;
import Creational.Factory.products.Foods.Burger;
import Creational.Factory.products.Foods.ChickenBurger;

public class ChickenRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
    @Override
    protected Drink createDrink() {
        return new MilkTea();
    }
}
