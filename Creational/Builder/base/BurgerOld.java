package Creational.Builder.base;

public class BurgerOld {
    private String name;
    private int buns;
    private String meat;
    private boolean hasCheese;
    private boolean hasVeggie;
    private boolean hasSauce;
    private boolean isExtraMeat;

    public BurgerOld(String name, int buns, String meat) {
        this(name, buns, meat, false, false, false, false);
    }

    public BurgerOld(String name, int buns, String meat, boolean hasCheese) {
        this(name, buns, meat, hasCheese, false, false, false);
    }

    public BurgerOld(String name, int buns, String meat, boolean hasCheese, 
                     boolean hasVeggie, boolean hasSauce, boolean isExtraMeat) {
        this.name = name;
        this.buns = buns;
        this.meat = meat;
        this.hasCheese = hasCheese;
        this.hasVeggie = hasVeggie;
        this.hasSauce = hasSauce;
        this.isExtraMeat = isExtraMeat;
    }

    public void show() {
        System.out.println("Burger: " + name);
    }
}