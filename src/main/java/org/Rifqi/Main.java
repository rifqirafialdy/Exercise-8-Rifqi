package org.Rifqi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Event event = new Event("Rock Concert", 1, 50.0f, 2, 100.0f);
        System.out.println(event);
        event.showAvailableTickets();
        TicketSystem app = new TicketSystem();
        System.out.println("Checking available events before creation:");
        app.showEvents();

        // Create an event
        app.createEvent();

        // Show events after creation
        System.out.println("Checking available events after creation:");
        app.showEvents();

    }
}