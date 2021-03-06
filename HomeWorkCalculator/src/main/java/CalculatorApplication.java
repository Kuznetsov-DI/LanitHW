import exception.DivisionByZero;
import exception.WrongOperation;
import service.Calculator;

public class CalculatorApplication {
    public static void main(String[] args) throws WrongOperation, DivisionByZero {

        Calculator c = new Calculator();
        String active = " ";

        while (!(active.equals("N"))) {
            c.innerOperation();
            c.innerNum();
            c.resultOperation();
            active = c.closeConsole();
        }
    }
}
