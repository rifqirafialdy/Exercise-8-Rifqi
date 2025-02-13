package org.Rifqi;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private final String name;
    private final List<Ticket> tickets;

    public Event(String name, int regularTicketCount, float regularPrice, int vipTicketCount, float vipPrice) {
        this.name = name;
        this.tickets = new ArrayList<>();
        for (int i = 0; i < regularTicketCount; i++) {
            tickets.add(new Ticket(this, regularPrice, "Regular"));
        }
        for (int i = 0; i < vipTicketCount; i++) {
            tickets.add(new Ticket(this, vipPrice, "VIP"));
        }
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void showAvailableTickets() {
        System.out.println("Available Tickets for " + name + ":");
        for (Ticket ticket : tickets) {
            if (!ticket.isBooked()) {
                System.out.println("- " + ticket.getType() + " Ticket: $" + ticket.getPrice());
            }
        }
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', totalTickets=" + tickets.size() + "}";
    }
}
