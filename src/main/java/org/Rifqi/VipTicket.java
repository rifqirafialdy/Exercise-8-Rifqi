package org.Rifqi;

public class VipTicket extends Ticket {

    public VipTicket(Event event, float price) {
        super(event, price, "VIP");
        this.benefit = "Priority Entry + Free Merchandise";
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();

    }
}
