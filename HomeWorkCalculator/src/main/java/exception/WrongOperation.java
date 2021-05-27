package exception;

public class WrongOperation extends Exception{

    private String operation;

    public String getOperation() {
        return operation;
    }

    public WrongOperation (String message, String o){
        super(message);
        operation = o;
    }
}
