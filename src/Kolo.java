public class Kolo implements Figura {

    private double r;

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(r, 2);
    }
}
