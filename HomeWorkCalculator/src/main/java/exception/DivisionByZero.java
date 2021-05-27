package exception;

public class DivisionByZero extends Exception {

    private double zero;

    public double getZero() {
        return zero;
    }

    public DivisionByZero (String message, double o){
        super(message);
        zero = o;
    }
}
