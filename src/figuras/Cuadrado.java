package figuras;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double l) {
        super(l, l);
    }

    public String toString() {
        return "El cuadrado de lado " + this.getl() + " tiene como área: " + super.area();
    }
}