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
        System.out.println("\n Available Events:");
        for (Event event : events) {
            System.out.println(event.getName());

        }
    }
}
