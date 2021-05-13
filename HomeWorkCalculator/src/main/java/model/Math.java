package model;


public class Math {
    
    private long one;
    private long two;

    public Math(long one, long two) {
        this.one = one;
        this.two = two;
    }

    public long sum (){
        return this.one + this.two;
    }

    public long division (){
        return this.one - this.two;
    }

    public long multiplication (){
        return this.one * this.two;
    }

    public long subtraction (){
        return this.one / this.two;
    }
}
