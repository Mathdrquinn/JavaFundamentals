package xyz.brendanquinn.operators;

/**
 * Created by brendanquin on 4/29/16.
 */
public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode = 'a';
    public double result;

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);

        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        this.execute();
    }

    
    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = (rightVal != 0.0d) ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("That is not a valid operation!");
                result = 0.0d;
                break;
        }
    }
}
