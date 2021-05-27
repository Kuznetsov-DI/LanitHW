package service;


import exception.DivisionByZero;

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

    public double subtraction (){
        return this.one - this.two;
    }

    public double multiplication (){
        return this.one * this.two;
    }

    public double division () throws DivisionByZero {

        if (this.two == 0) throw new DivisionByZero("На ноль делить нельзя!", this.two);
        return this.one / this.two;
    }

}
