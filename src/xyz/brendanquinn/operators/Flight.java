package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/18/16.
 */
public class Flight {
    static final int MAX_FAA_SEATS = 550;
    private int flightNumber;
    private int  seats = 150, passengers, openSeats;
    String flightClass, destination = "Tampa";

    {
        this.calcOpenSeats();
    }

    public Flight() {
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(String flightClass) {
        this.flightClass = flightClass;
    }

    public Flight(int flightNumber, int passengers) {
        this("Passenger");
        this.flightNumber = flightNumber;
        this.passengers = passengers;
        this.calcOpenSeats();
    }

    @Override
    public String toString() {
        if(flightNumber > 0) {
            return "Flight #" + flightNumber;
        } else {
            return "Flight Class " + flightClass;
        }
    }

    public String description() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("This plane, ");
        sb.append(this.toString());
        sb.append(", flies to ");
        sb.append(this.destination);
        sb.append(".");

        String message = sb.toString();

        return message;
    }

    public void calcOpenSeats() {
        openSeats = seats - passengers;
    }

    public int getOpenSeats() {
        this.calcOpenSeats();
        return this.openSeats;
    }

    public int setSeats(int seats) {
        if(seats <= MAX_FAA_SEATS) {
            this.seats = seats;
            this.calcOpenSeats();
        } else {
            System.out.println(seats + " seats is above legal limit.");
        }

        return (seats <= MAX_FAA_SEATS) ? seats : MAX_FAA_SEATS;
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
