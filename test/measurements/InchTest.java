package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void compare2InchTo5Cm() {
        Inch inches = new Inch(2);
        Centimeter cms = new Centimeter(5);

        assert(inches.equalsToCM(cms));
    }

    @Test
    void equalsToCM() {
        Inch inches = new Inch(1);
        Centimeter cms = new Centimeter(2.5);
        assert(inches.equalsToCM(cms));
    }
}