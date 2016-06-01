package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 4/26/16.
 */
public class Main {

    public static void main(String[] args) {
        Flight plane1 = new Flight(123, 49);
        Flight plane2 = new Flight(135);

        System.out.println("Passenger Flights");

        System.out.println("");
        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane2.description());
        System.out.println("");

        plane2.addPassengers(37);
        System.out.println(plane2.getOpenSeats());
        plane1.setSeats(331);
        plane2.setSeats(3631);
        System.out.println("");

        CargoFlight cf = new CargoFlight();

        System.out.println("Pack Cargo Plane");
        System.out.println("");

        System.out.println(cf.getSeats());
        System.out.println(cf.getUsedCargoSpace());
        cf.add1Package(3.8f, 7f, 9.8f);
        System.out.println(cf.getUsedCargoSpace());
        cf.add1Package(20.0f, 40.0f, 60.0f);

        System.out.println(cf);

    }

    public static void swapFlightNumbers(Flight flight1, Flight flight2) {
        int flight1Number = flight1.getFlightNumber();
        int flight2Number = flight2.getFlightNumber();

        flight1.setFlightNumber(flight2Number);
        flight2.setFlightNumber(flight1Number);
    }

}
