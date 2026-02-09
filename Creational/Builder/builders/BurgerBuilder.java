package Creational.Builder.builders;

public interface BurgerBuilder {
    void setType(String type);
    void setBuns(int number);
    void setMeat(String meatType);
    void addCheese();
    void addVegatables();
    void addSauces();
}
