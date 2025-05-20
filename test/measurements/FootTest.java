package measurements;

import org.junit.jupiter.api.Test;

class FootTest {
    @Test
    void oneFootEqualTo12Inches() {
        Foot foots = new Foot(1);
        Inch inches = new Inch(12);
        assert(foots.equalsToInches(inches));
    }
}