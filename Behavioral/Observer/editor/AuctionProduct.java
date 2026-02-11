package Behavioral.Observer.editor;

import Behavioral.Observer.event_manager.EventManager;

public class AuctionProduct {
    public EventManager events;
    private String name;
    private double price;

    public AuctionProduct(String name) {
        this.name = name;
        this.events = new EventManager("priceUpdate", "bidEnd");
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        events.notify("priceUpdate", name, price);
    }

    public void endAuction() {
        events.notify("bidEnd", name, price);
    }
}