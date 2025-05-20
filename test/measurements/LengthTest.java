package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void centimeterToMm() {
        Length cm = Length.createCentimeters(1);
        Length mm = Length.createMillimeteres(10);
        assertEquals(cm, mm);
    }

    @Test
    void twoCmToMm() {
        Length cm = Length.createCentimeters(2);
        Length mm = Length.createMillimeteres(20);
        assertEquals(cm, mm);
    }

    @Test
    void inchesToCm() {
        Length inches = Length.createInches(2);
        Length cm = Length.createCentimeters(5);
        assertEquals(cm, inches);
    }

    @Test
    void footToInch() {
        Length inches = Length.createInches(12);
        Length foots = Length.createFoots(1);
        assertEquals(foots, inches);
    }
}