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

    @Test
    void addTwoUnits() {
        Length unit1 = Length.createCentimeters(1);
        Length unit2 = Length.createCentimeters(2);
        assertEquals(Length.createMillimeteres(30), unit1.add(unit2));
    }

    @Test
    void addTwoFootUnits() {
        Length unit1 = Length.createFoots(2);
        Length unit2 = Length.createFoots(3);
        assertEquals(Length.createInches(60), unit1.add(unit2));
    }
}