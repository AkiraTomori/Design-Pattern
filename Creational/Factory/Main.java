package Creational.Factory;
import Creational.Factory.products.Burger;
import Creational.Factory.factory_methods.*;
// import Creational.Factory.bases.SimpleRestaurant;

public class Main {
    public static void main(String []args) {
        // SimpleRestaurant restaurant = new SimpleRestaurant();
        // Burger burger1 = restaurant.orderBurger("Beef");
        // Burger burger2 = restaurant.orderBurger("Chicken");

        Restaurant beefRestaurant = new BeefRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();
        Restaurant chickenRestaurant = new ChickenRestaurant();
        Burger chickenBurger = chickenRestaurant.orderBurger();
    }
}