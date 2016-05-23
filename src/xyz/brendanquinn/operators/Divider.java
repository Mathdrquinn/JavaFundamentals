package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/23/16.
 */
public class Divider extends CalculateBase {
    public Divider() {};
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = (getRightVal() == 0) ? 0d : getLeftVal() / getRightVal();
        setResult(value);
    }
}
