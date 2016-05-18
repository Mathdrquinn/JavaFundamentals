package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/18/16.
 */
public class Flight {
    private int flightNumber;
    private int seats = 150;
    private int passengers;
    private int openSeats;

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

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public int getOpenSeats() {
        this.calcOpenSeats();
        return this.openSeats;
    }
}
