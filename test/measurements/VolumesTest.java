package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumesTest {
    @Test
    void gallonAndLiters() {
        Volumes gallon = Volumes.createGallon(1);
        Volumes liters = Volumes.createLiters(3.78);
        assertEquals(liters, gallon);
    }

    @Test
    void twoGallonsToLiters() {
        Volumes gallon = Volumes.createGallon(2);
        Volumes liters = Volumes.createLiters(7.56);
        assertEquals(liters, gallon);
    }
}