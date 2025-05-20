package measurements;

import java.util.Objects;
public class Measurement {
    private final double length;
    private final Unit unit;

    public Measurement(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Measurement create(double length, Unit unit) {
        return new Measurement(length,unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement measurement1 = (Measurement) o;
        double difference = (length * unit.baseValue() - measurement1.length * measurement1.unit.baseValue());
        return difference < .05 && difference > -.05;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

    public Measurement add(Measurement unit2) {
        double total = length * unit.baseValue() +  unit2.length * unit2.unit.baseValue();

        if(unit == Unit.GALLON || unit == Unit.LITERS) {
            return new Measurement(total/Unit.LITERS.baseValue(), Unit.LITERS);
        }
        return new Measurement(total/ Unit.INCHES.baseValue(), Unit.INCHES);
    }
}
