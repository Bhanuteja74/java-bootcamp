package measurements;

import java.util.Objects;

public class Length {
    private final double length;

    public Length(double length) {
        this.length = length;
    }

    public static Length createCentimeters(int cm) {
        return new Length(cm * 10);
    }

    public static Length createMillimeteres(int mm) {
        return new Length(mm * 1);
    }

    public static Length createInches(int inch) {
        return new Length(inch * 2.5 * 10);
    }


    public static Length createFoots(int foot) {
        return new Length(foot * 300);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return Double.compare(length, length1.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

    public Length add(Length unit2) {
        return new Length(length + unit2.length);
    }
}
