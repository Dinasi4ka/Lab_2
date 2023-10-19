package task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class AviaCompany {
    private final List<Airport> airports = new ArrayList<>();
    private final List<Flight> flight = new ArrayList<>();
    private final List<Passenger> passenger = new ArrayList<>();
    private final List<Ticket> tickets = new ArrayList<>();

    public final void addAirport(Airport airport) {
        airports.add(airport);
    }

    public final void editAirport(final Airport airport1, final Airport airport2) {
        if (!airport1.equals(airport2)) {
            airports.remove(airport1);
            airports.add(airport2);
        } else {
            System.out.println("Airport not found" + airport2.getCode());
        }
    }

    public final void removeAirport(Airport airport) {
        airports.remove(airport);
    }
    public final void addFlight(Flight flight) {
        this.flight.add(flight);
    }

    public final void editFlight(final Flight flight1, final Flight flight2) {
        if (!flight1.equals(flight2)) {
            this.flight.remove(flight1);
            this.flight.add(flight2);
        } else {
            System.out.println("Flight not found" + flight2.getName());
        }
    }

    public final void removeFlight(final Flight flight) {
        this.flight.remove(flight);
    }

    public final void addPassenger(final Passenger passenger) {
        this.passenger.add(passenger);
    }

    public final void editPassenger(final Passenger passenger1, final Passenger passenger2) {
        if (!passenger1.equals(passenger2)) {
            this.passenger.remove(passenger1);
            this.passenger.add(passenger2);
        } else {
            System.out.println("Passenger not found");
        }
    }

    public final void removePassenger(final Passenger passenger) {
        this.passenger.remove(passenger);
    }

    public final void addTicket(final Ticket ticket) {
        this.tickets.add(ticket);
    }

    public final void editTicket(final Ticket ticket1, final Ticket ticket2) {
        if (!ticket1.equals(ticket2)) {
            this.tickets.remove(ticket1);
            this.tickets.add(ticket2);
        } else {
            System.out.println("Ticket not found");
        }
    }

    public final void removeTicket(final Ticket ticket) {
        this.tickets.remove(ticket);
    }

    public void showAllFlights() {
        System.out.println("Available flights:");
        for (Flight flight : flight) {
            System.out.println(flight.getName());
        }
    }
    public void showPriceForPeriod(LocalDate date1, LocalDate date2) {
        double cost = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getDate().isAfter(date1) && ticket.getDate().isBefore(date2)) {
                cost += ticket.getCost();
            }
        }
        System.out.println("\nCost for choose period = " + cost);
        ;
    }
}
