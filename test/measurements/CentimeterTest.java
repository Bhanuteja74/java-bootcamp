package measurements;

import org.junit.jupiter.api.Test;

class CentimeterTest {
    @Test
    void oneCMEqualsTO10mm() {
        Centimeter centimeter = new Centimeter(1);
        Millimeter mm = new Millimeter(10);
        assert(centimeter.equalsToMm(mm));
    }
}