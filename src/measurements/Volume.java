package measurements;

import java.util.Objects;

public class Volume {
    private final double volume;
    private final Unit unit;

    public Volume(double volume, Unit unit) {
        this.volume = volume;
        this.unit = unit;
    }

    public static Volume create(double volume, Unit unit) {
        return new Volume(volume, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume1 = (Volume) o;
        return volume * unit.baseValue() == volume1.volume * volume1.unit.baseValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, unit);
    }
}
