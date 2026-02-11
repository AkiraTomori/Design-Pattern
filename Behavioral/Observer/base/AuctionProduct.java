package Behavioral.Observer.base;

public class AuctionProduct {
    private String name;
    private double currentPrice;

    public AuctionProduct(String name, double initialPrice) {
        this.name = name;
        this.currentPrice = initialPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        System.out.println("The price of " + name + " has been updated to: $" + currentPrice);

        // Violate the Single Responsibility Principle by adding multiple responsibilities here
        // AuctionProduct object does not need to handle notifications, admin dashboard updates, or logging
        sendEmailNotification();
        updateAdminDashboard();
        saveLogToSystem();

        // What happens if we want to add more addtional method like sending SMS notification
        // or pushing updates to a mobile app? The AuctionProduct class will keep growing
        // Violating the Open/Closed Principle as well
    }

    private void sendEmailNotification() {
        System.out.println("Sending email notification to bidders about the new price: $" + currentPrice);
    }

    private void updateAdminDashboard() {
        System.out.println("Updating admin dashboard with the new price: $" + currentPrice);
    }

    private void saveLogToSystem() {
        System.out.println("Saving log: Price of " + name + " updated to $" + currentPrice);
    }
}
