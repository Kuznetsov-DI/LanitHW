import exception.WrongOperation;
import service.Calculator;

public class CalculatorApplication {
    public static void main(String[] args) throws WrongOperation {

        Calculator c = new Calculator();

        c.innerOperation();
        c.innerNum();
        c.resultOperation();

    }
}
