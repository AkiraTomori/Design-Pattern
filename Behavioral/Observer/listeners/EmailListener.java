package Behavioral.Observer.listeners;

public class EmailListener implements EventListener {
    private String email;
    public EmailListener(String email) { this.email = email; }

    @Override
    public void update(String eventType, String itemName, double price) {
        System.out.println("Email to " + email + ": The event '" + eventType + "' occurred for item '" + itemName + "' with new price: " + price);
    }
}