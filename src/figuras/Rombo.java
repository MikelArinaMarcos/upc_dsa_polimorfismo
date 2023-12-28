package figuras;

public class Rombo extends Figura {
    public Rombo(){}
    private double D;
    private double d;

    public double getD() {
        return D;
    }

    public double getd() {
        return d;
    }
    public Rombo (double D, double d){
        this.D=D;
        this.d=d;
    }
    public double area(){
        return (this.D*this.d/2);
    }

    public String toString() {return "El rombo de diagonal " + this.D + " y segunda diagonal de " + this.d + " tiene como área: " + this.area();}

}
