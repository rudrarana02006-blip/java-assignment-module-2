class TicketBookingSystem {
    private int availableTickets = 5;

    public synchronized void bookTicket(String passengerName, int requestedTickets) {
        if (requestedTickets <= availableTickets) {
            System.out.println(passengerName + " successfully booked " + requestedTickets + " ticket(s).");
            availableTickets -= requestedTickets;
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println(passengerName + " failed to book " + requestedTickets + " ticket(s). Available: " + availableTickets);
        }
    }
}

class PassengerThread extends Thread {
    private TicketBookingSystem system;
    private String passengerName;
    private int tickets;

    public PassengerThread(TicketBookingSystem system, String passengerName, int tickets) {
        this.system = system;
        this.passengerName = passengerName;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        system.bookTicket(passengerName, tickets);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        PassengerThread p1 = new PassengerThread(system, "Alice", 2);
        PassengerThread p2 = new PassengerThread(system, "Bob", 3);
        PassengerThread p3 = new PassengerThread(system, "Charlie", 2);

        p1.start();
        p2.start();
        p3.start();
    }
}
