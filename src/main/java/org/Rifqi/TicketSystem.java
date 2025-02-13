package org.Rifqi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketSystem {
    private final List<Event> events;
    private final Scanner scanner;

    public TicketSystem() {
        this.events = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void createEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Event Name :");
        String name = scanner.nextLine();
        System.out.println("Number of Regular Ticket :");
        int regularCount = scanner.nextInt();
        System.out.println("Price of Regular Ticket");
        float regularPrice = scanner.nextFloat();
        System.out.println("Number of VIP Ticket :");
        int vipCount = scanner.nextInt();
        System.out.println("Price of Vip Ticket :");
        float vipPrice = scanner.nextFloat();
        Event event = new Event(name, regularCount, regularPrice, vipCount, vipPrice);
        events.add(event);
        System.out.println("Event " + name + "Created");
    }

    public void showEvents() {
        if (events.isEmpty()) {
            System.out.println(" No events available.");
            return;
        }
        System.out.println("Available Events:");
        for (Event event : events) {
            System.out.println(event.getName());

        }
    }

    public void bookEvent() {
        if (events.isEmpty()) {
            System.out.println("No Event Available");
        }
        System.out.println("Choose an Event to Book :");
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + "." + events.get(i).getName());
        }
        System.out.println("Enter the Number :");
        int eventIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        if (eventIndex < 0 || eventIndex >= events.size()) {
            System.out.println("Invalid Selection");
        }
        System.out.println("Choose ticket type:");
        System.out.println("1. Regular");
        System.out.println("2. VIP");
        System.out.print("Enter your choice: ");
        int ticketTypeChoice = scanner.nextInt();
        scanner.nextLine();

        String ticketType = (ticketTypeChoice == 1) ? "Regular" : (ticketTypeChoice == 2) ? "VIP" : null;

        if (ticketType == null) {
            System.out.println("Invalid ticket type selection.");
        }
        Event selectedEvent = events.get(eventIndex);

        Ticket availableTicket = selectedEvent.getAvailableTicket(ticketType);

        if (availableTicket != null) {
            System.out.println("Ticket is Available for Booking");
            System.out.print("Please Enter your name: ");
            String buyerName = scanner.nextLine();

            availableTicket.bookTicket(buyerName);

            availableTicket.printTicketDetails();


        } else {
            System.out.println("Not available " + ticketType + " tickets.");
        }
    }

    public void runSystem() {
        while (true) {
            try {
                System.out.println("Ticket System Menu ");
                System.out.println("1. Create Event");
                System.out.println("2. Show Events");
                System.out.println("3. Book Event");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                if (!scanner.hasNextInt()) {
                    scanner.next();
                    throw new IllegalArgumentException("Invalid input! Please enter a number.");
                }

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException("Invalid choice! Please enter 1-4.");
                }

                switch (choice) {
                    case 1 -> createEvent();
                    case 2 -> showEvents();
                    case 3 -> bookEvent();
                    case 4 -> {
                        System.out.println("Exiting Ticket App");
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input Please Try Again");
                scanner.nextLine();

            }
        }
    }


}
