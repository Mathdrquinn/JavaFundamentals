package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 4/26/16.
 */
public class Main {

    public static void main(String[] args) {
        Flight plane1 = new Flight(123, 49);
        Flight plane2 = new Flight(29, 112);

        CargoFlight cf = new CargoFlight();

        System.out.println(cf.getSeats());
        System.out.println(cf.getUsedCargoSpace());
        cf.add1Package(3, 7, 9);
        System.out.println(cf.getUsedCargoSpace());
        cf.add1Package(20, 40, 60);

    }

    public static void swapFlightNumbers(Flight flight1, Flight flight2) {
        int flight1Number = flight1.getFlightNumber();
        int flight2Number = flight2.getFlightNumber();

        flight1.setFlightNumber(flight2Number);
        flight2.setFlightNumber(flight1Number);
    }

}
