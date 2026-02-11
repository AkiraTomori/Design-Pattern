package Behavioral.Observer;

import Behavioral.Observer.editor.AuctionProduct;
import Behavioral.Observer.listeners.EmailListener;
import Behavioral.Observer.listeners.EventListener;
import Behavioral.Observer.listeners.SMSListener;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Subject (Publisher)
        // This is the product being auctioned
        AuctionProduct laptop = new AuctionProduct("MacBook M3 Pro");

        // 2. Initialize the Subscribers (Listeners) via the EventListener Interface
        // This initialization method helps keep the code flexible and hides implementation details.
        EventListener tungEmail = new EmailListener("tung.dev@gmail.com");
        EventListener tungSMS = new SMSListener("0901234567");
        EventListener lanEmail = new EmailListener("lan.bidder@yahoo.com");

        // 3. Subscribe to notifications
        // TTung wants to monitor price changes via both Email and SMS.
        laptop.events.subscribe("priceUpdate", tungEmail);
        laptop.events.subscribe("priceUpdate", tungSMS);

        // Lan only cares when the auction ends to know the result.
        laptop.events.subscribe("bidEnd", lanEmail);

        // 4. State change events
        System.out.println("--- Phase 1: BIDDING ---");
        // When the price changes, EventManager will automatically call update() on tungEmail and tungSMS.
        laptop.setPrice(2500.0);
        laptop.setPrice(2800.0);

        System.out.println("\n--- Phase 2: TUNG UNSUBSCRIBES SMS ---");
        // Unsubscribe at runtime without affecting other listeners.
        laptop.events.unsubscribe("priceUpdate", tungSMS);
        laptop.setPrice(3000.0);

        System.out.println("\n--- Phase 3: AUCTION ENDS ---");
        // At this point, only Lan receives the notification because she subscribed to the "bidEnd" event.
        laptop.endAuction();
    }
}