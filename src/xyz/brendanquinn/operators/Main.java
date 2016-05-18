package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 4/26/16.
 */
public class Main {

    public static void main(String[] args) {
        Flight plane1 = new Flight(123, 49);
        Flight plane2 = new Flight(29, 112);

        System.out.println("Before:");
        System.out.println(plane1.getFlightNumber());
        System.out.println(plane1.getOpenSeats());
        System.out.println(plane2.getFlightNumber());
        System.out.println(plane2.getOpenSeats());

        swapFlightNumbers(plane1, plane2);

        System.out.println("After:");
        System.out.println(plane1.getFlightNumber());
        System.out.println(plane1.getOpenSeats());
        System.out.println(plane2.getFlightNumber());
        System.out.println(plane2.getOpenSeats());

        System.out.println("Expect Plan1 to have 149 open seats");
        plane1.addPassengers(-48);
        System.out.println(plane1.getOpenSeats());

    }

    public static void swapFlightNumbers(Flight flight1, Flight flight2) {
        int flight1Number = flight1.getFlightNumber();
        int flight2Number = flight2.getFlightNumber();

        flight1.setFlightNumber(flight2Number);
        flight2.setFlightNumber(flight1Number);
    }

}
