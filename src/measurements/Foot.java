package measurements;

public class Foot {
    private final double foots;

    public Foot(double foots) {
        this.foots = foots;
    }


    public boolean equalsToInches(Inch inches) {
            return this.foots * 12 == inches.inches;
    }
}
