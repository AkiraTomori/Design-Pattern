package Creational.Factory;
import Creational.Factory.factory_methods.*;
import Creational.Factory.products.Bevarages.Drink;
// import Creational.Factory.bases.SimpleRestaurant;
import Creational.Factory.products.Foods.Burger;

public class Main {
    public static void main(String []args) {
        // SimpleRestaurant restaurant = new SimpleRestaurant();
        // Burger burger1 = restaurant.orderBurger("Beef");
        // Burger burger2 = restaurant.orderBurger("Chicken");

        Restaurant beefRestaurant = new BeefRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();
        Drink softdrink = beefRestaurant.orderDrink();
        
        Restaurant chickenRestaurant = new ChickenRestaurant();
        Burger chickenBurger = chickenRestaurant.orderBurger();
        Drink milkTea = chickenRestaurant.orderDrink();
    
    }
}