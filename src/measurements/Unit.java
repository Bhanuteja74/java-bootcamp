package measurements;

public enum Unit {
    LITERS(1),
    GALLON(3.78),
    FOOT(300),
    INCHES(25),
    CENTIMETERS(10),
    MILLIMETERS(1);

    private final double number;

    Unit(double number) {
        this.number = number;
    }

    public double baseValue() {
        return number;
    }
}
