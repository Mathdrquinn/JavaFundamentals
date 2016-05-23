package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 5/23/16.
 */
public class Subtractor extends CalculateBase {
    public Subtractor() {}
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
