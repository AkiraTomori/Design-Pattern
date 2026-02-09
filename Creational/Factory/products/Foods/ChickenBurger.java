package Creational.Factory.products.Foods;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}
