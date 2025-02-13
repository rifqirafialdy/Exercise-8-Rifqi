package org.Rifqi;

import java.util.UUID;

class Ticket implements Ticketable {
    private final UUID ticketId;
    private final float price;
    private final String type;
    private boolean isBooked;
    private static int totalTicketSold = 0;
    private final Event event;
    private String buyerName;
    protected String benefit;

    public Ticket(Event event, float price, String type) {
        this.ticketId = UUID.randomUUID();
        this.price = price;
        this.type = type;
        this.isBooked = false;
        this.event = event;
        this.buyerName = "";
        this.benefit = "";
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

    public String getBuyerName() {
        return buyerName;
    }

    public boolean bookTicket(String buyerName) {
        if (!isBooked) {
            this.isBooked = true;
            this.buyerName = buyerName;
            totalTicketSold++;
            return true;
        }
        return false;
    }


    @Override
    public void printTicketDetails() {
        System.out.println("Event : " + event.getName() + "|| Ticket ID: " + ticketId + " || Type: " + type + " || Price: $" + price + "|| Name : " + buyerName + " || Booking Status : " + (isBooked ? "Complete" : "Not Booked") + "|| Benefit :" + benefit);
    }

}

