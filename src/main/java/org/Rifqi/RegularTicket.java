package org.Rifqi;

public class RegularTicket extends Ticket {
    public RegularTicket(Event event, float price) {
        super(event, price, "Regular");
        this.benefit = "Standard Access";
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
    }
}

