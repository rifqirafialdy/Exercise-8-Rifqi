package org.Rifqi;

import java.util.UUID;

class Ticket implements Ticketable {
    private final UUID ticketId;
    private static int totalSale;
    private final float price;
    private final String type;
    private final boolean isBooked;
    private static final int totalTicketSold = 0;
    private final Event event;

    public Ticket(Event event, float price, String type) {
        this.ticketId = UUID.randomUUID();
        this.price = price;
        this.type = type;
        this.isBooked = false;
        this.event = event;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isBooked() {
        return isBooked;
    }


    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: " + ticketId + " || Type: " + type + " || Price: $" + price + " || Booking Status : " + isBooked);
    }

}

