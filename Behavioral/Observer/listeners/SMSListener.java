package Behavioral.Observer.listeners;

public class SMSListener implements EventListener {
    private String phoneNumber;

    public SMSListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, String itemName, double price) {
        // In a real application, you would send an SMS, here we print to the console for demonstration
        System.out.println("SMS to " + phoneNumber + ": Event '" + eventType + 
                           "' recorded for item '" + itemName + "' with price " + price);
    }
}