package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gallonTest {
    @Test
    void OneGallonInLiters() {
        Gallon gallon = new Gallon(1);
        Liters li = new Liters(3.78);
        assert(gallon.equalsToli(li));
    }


    @Test
    void twoGallonsInLI() {
        Gallon gallon = new Gallon(2);
        Liters li = new Liters(7.56);
        assert(gallon.equalsToli(li));
    }

    @Test
    void compareGallonAndLiters() {
        Gallon gallon = new Gallon(1);
        Liters li = new Liters(3.78);
        assert(gallon.compareWith(li));
    }
}