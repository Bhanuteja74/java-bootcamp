package measurements;

import java.util.Objects;

public class Volumes {
    private final double volume;

    public Volumes(double volume) {
        this.volume = volume;
    }

    public static Volumes createGallon(double gallon) {
        return new Volumes(gallon * 3.78);
    }

    public static Volumes createLiters(double liters) {
        return new Volumes(liters * 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volumes volumes = (Volumes) o;
        return Double.compare(volume, volumes.volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(volume);
    }
}
