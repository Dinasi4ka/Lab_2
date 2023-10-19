package task3;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane("Boeing 737-800", 100));
        planes.add(new Plane("Airbus A320", 200));
        planes.add(new Plane("Embraer 190", 300));

        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport("Lviv"));
        airports.add(new Airport("Kyiv"));

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Lviv-Kyiv", planes.get(0), LocalDate.of(2023, 10, 10), LocalDate.of(2023, 9, 11)));
        flights.add(new Flight("Kyiv-Warsaw", planes.get(1), LocalDate.of(2023, 9, 11), LocalDate.of(2023, 9, 12)));
        flights.add(new Flight("Kyiv-Odessa", planes.get(2), LocalDate.of(2023, 8, 10), LocalDate.of(2023, 9, 11)));

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Mykola", "Mukolenko"));
        passengers.add(new Passenger("Ivan", "Ivanenko"));
        passengers.add(new Passenger("Petro", "Petrenko"));

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(LocalDate.of(2013, 9, 23), passengers.get(0), flights.get(0), airports.get(1), 100));
        tickets.add(new Ticket(LocalDate.of(2014, 9, 13), passengers.get(1), flights.get(1), airports.get(0), 109));
        tickets.add(new Ticket(LocalDate.of(2014, 9, 13), passengers.get(2), flights.get(2), airports.get(0), 400));

        LocalDate dateStart = LocalDate.of(2013, 9, 1);
        LocalDate dateEnd = LocalDate.of(2013, 9, 30);

        AviaCompany company = new AviaCompany();

        for (Airport airport : airports) {
            company.addAirport(airport);
        }

        for (Flight flight : flights) {
            company.addFlight(flight);
        }

        company.removeFlight(flights.get(1));
        company.editFlight(flights.get(1), flights.get(2));

        for (Ticket ticket : tickets) {
            company.addTicket(ticket);
        }

        Schedule schedule = new Schedule();
        schedule.addFlight(flights.get(0));
        schedule.addFlight(flights.get(1));
        schedule.addFlight(flights.get(2));

        company.showAllFlights();
        company.showPriceForPeriod(dateStart, dateEnd);

        System.out.println("\n--------------------------------------------------");

        System.out.println("Flight Schedule:");

        for (Flight flight : schedule.getFlights()) {
            System.out.println(flight.getName() + " Departure: " + flight.getDepartureTime() + " Arrival: " + flight.getArrivalTime());
        }
        System.out.println("\n--------------------------------------------------");

        System.out.println("Reserved Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket.getPassenger().getFirstName() + " " + ticket.getPassenger().getSecondName() +
                    " booked a ticket for " + ticket.getFlight().getName() + " from " + ticket.getDeparture().getCode() +
                    " on " + ticket.getDate() + " for " + ticket.getCost());
        }
    }
}
