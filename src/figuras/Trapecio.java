package figuras;

public class Trapecio extends Figura {
    public Trapecio(){}
    private double B;
    private double b;
    private double h;

    public double getB() {
        return B;
    }

    public double getb() {
        return b;
    }

    public double geth() {
        return h;
    }
    public Trapecio (double B, double b, double h){
        this.B=B;
        this.b=b;
        this.h=h;
    }
    public double area(){
        return ((this.B*this.b*this.h)/2);
    }

    public String toString() {return "El trapecio de bases " + this.B + " y " + this.b + " y de altura " + this.h + " tiene como área: " + this.area();}

}