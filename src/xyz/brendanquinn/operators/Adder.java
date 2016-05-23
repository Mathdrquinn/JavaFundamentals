package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/23/16.
 */
public class Adder extends CalculateBase {
    public Adder() {}
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    // called annotation
    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
