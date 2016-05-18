package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/18/16.
 */
public class Flight {
    private int flightNumber, seats = 150, passengers, openSeats;

    {
        this.calcOpenSeats();
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
        this.calcOpenSeats();
    }

    public Flight(int flightNumber, int passengers) {
        this.flightNumber = flightNumber;
        this.passengers = passengers;
        this.calcOpenSeats();
    }

    public void calcOpenSeats() {
        openSeats = seats - passengers;
    }

    public int getOpenSeats() {
        this.calcOpenSeats();
        return this.openSeats;
    }

    private boolean hasSeating(int newPassengers) {
        return newPassengers <= this.openSeats && this.openSeats - newPassengers <= seats;
    }

    public void addPassengers(int change) {
        if(this.hasSeating(change)) {
            this.passengers += change;
            this.calcOpenSeats();
        } else {
            System.out.println("Insufficient Seating");
        }
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

}
