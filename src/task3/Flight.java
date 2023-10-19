package task3;

import java.time.LocalDate;

public class Flight {
    private String name;
    private Plane plane;
    private LocalDate departureTime;
    private LocalDate arrivalTime;

    public Flight(String name, Plane plane, LocalDate departureTime, LocalDate arrivalTime) {
        this.name = name;
        this.plane = plane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDate getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDate arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
