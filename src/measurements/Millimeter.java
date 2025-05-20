package measurements;

public class Millimeter {
    protected final double mm;

    public Millimeter(double mm) {
        this.mm = mm;
    }

    public double centimeters() {
        return this.mm / 10;
    }
}
