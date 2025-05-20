package measurements;

import java.util.Objects;

public class Length {
    private final double length;
    private final Unit unit;

    public Length(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Length create(double length, Unit unit) {
        return new Length(length,unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return length * unit.baseValue() == length1.length * length1.unit.baseValue();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

    public Length add(Length unit2) {
        double total = length * unit.baseValue() +  unit2.length * unit2.unit.baseValue();
        return new Length(total/ Unit.INCHES.baseValue(), Unit.INCHES);
    }
}
