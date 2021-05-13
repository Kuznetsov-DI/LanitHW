package service;


import exception.SecondArgumentIsNull;

public class Math {

    private final double one;
    private final double two;

    public Math(double one, double two) {
        this.one = one;
        this.two = two;
    }

    public double getOne() {
        return one;
    }

    public double getTwo() {
        return two;
    }

    public double sum (){
        return this.one + this.two;
    }

    public double division (){
        return this.one - this.two;
    }

    public double multiplication (){
        return this.one * this.two;
    }

    public double subtraction () throws SecondArgumentIsNull {

        if (this.two == 0) throw new SecondArgumentIsNull("На ноль делить нельзя!", this.two);
        return this.one / this.two;
    }

}
