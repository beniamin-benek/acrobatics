public class Prostokat implements Figura {

    private double a;
    private double b;

    @Override
    public double obliczObwod() {
        return 4 * a;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
