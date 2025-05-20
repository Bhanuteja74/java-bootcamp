package measurements;

public class Centimeter {
    protected final double cms;
    public Centimeter(double cms) {
        this.cms = cms;
    }

    public boolean equalsToMm(Millimeter mm) {
        return this.cms == mm.centimeters();
    }
}
