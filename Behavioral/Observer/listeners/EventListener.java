package Behavioral.Observer.listeners;

public interface EventListener {
    void update(String eventType, String itemName, double newPrice);
}
