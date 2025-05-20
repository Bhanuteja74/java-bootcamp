package measurements;

public class Inch {
    protected final double inches;

    public Inch(double inches) {
        this.inches = inches;
    }

    public boolean equalsToCM(Centimeter cms) {
        return  inches * 2.5 == cms.cms;
    }
}