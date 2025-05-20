package measurements;

public class Liters {
    private final double liter;

    public Liters(double liter) {
        this.liter = liter;
    }

    public double toGallon() {
        return liter/3.78;
    }

    public double liters() {
        return liter;
    }
}
