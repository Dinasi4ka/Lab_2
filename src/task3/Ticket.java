package task3;
import java.time.LocalDate;
public class Ticket {
    private final LocalDate date;
    private final Passenger passenger;
    private Flight flight;
    private Airport departure;
    private double cost;

    public Ticket(LocalDate date, Passenger passenger, Flight flight, Airport departure, double cost) {
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
        this.departure = departure;
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
