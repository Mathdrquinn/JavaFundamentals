package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/23/16.
 */
public class CargoFlight extends Flight {
    private int seats = 12;
    private float maxCargoSpace = 10000,
        usedCargoSpace;

    public CargoFlight() {}

    int getSeats() { return seats; }
    public float getUsedCargoSpace() { return usedCargoSpace; }

    public void add1Package(float h, float w, float d) {
        float size = h * w * d;
        if(hasCargoSpace(size)) {
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    public boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

}
