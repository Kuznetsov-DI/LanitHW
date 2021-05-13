package exception;

public class SecondArgumentIsNull extends Exception {

    private double zero;

    public double getZero() {
        return zero;
    }

    public SecondArgumentIsNull (String message, double o){
        super(message);
        zero = o;
    }
}
