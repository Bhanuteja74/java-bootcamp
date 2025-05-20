package measurements;

public class Gallon {
    private final double gallons;

    public Gallon(double gallons) {
        this.gallons = gallons;
    }

    public boolean equalsToli(Liters li) {
        return gallons == li.toGallon();
    }

    public boolean compareWith(Liters li) {
        return liters() == li.liters();
    }

    private double liters() {
        return gallons * 3.78;
    }
}
