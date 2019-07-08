public class Trojkat implements Figura {

    private double a;
    private double b;
    private double c;
    private double h;

    @Override
    public double obliczObwod() {
        return a + b + c;
    }

    @Override
    public double obliczPole() {
        return a * h / 2;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
