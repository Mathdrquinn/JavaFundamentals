package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 4/26/16.
 */
public class Main {

    public static void main(String[] args) {
        Flight plane1 = new Flight(123, 49);

        System.out.println(plane1.getFlightNumber());
        System.out.println(plane1.getOpenSeats());
    }

}
