package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void gallonAndLiters() {
        Volume gallon = Volume.create(1, Unit.GALLON);
        Volume liters = Volume.create(3.78, Unit.LITERS);
        assertEquals(liters, gallon);
    }

    @Test
    void twoGallonsToLiters() {
        Volume gallon = Volume.create(2, Unit.GALLON);
        Volume liters = Volume.create(7.56, Unit.LITERS);
        assertEquals(liters, gallon);
    }
}