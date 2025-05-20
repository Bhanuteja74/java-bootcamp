package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void centimeterToMm() {
        Length cm = Length.create(1, Unit.CENTIMETERS);
        Length mm = Length.create(10, Unit.MILLIMETERS);
        assertEquals(cm, mm);
    }

    @Test
    void twoCmToMm() {
        Length cm = Length.create(2, Unit.CENTIMETERS);
        Length mm = Length.create(20, Unit.MILLIMETERS);
        assertEquals(cm, mm);
    }

    @Test
    void inchesToCm() {
        Length inches = Length.create(2, Unit.INCHES);
        Length cm = Length.create(5, Unit.CENTIMETERS);
        assertEquals(cm, inches);
    }

    @Test
    void footToInch() {
        Length inches = Length.create(12, Unit.INCHES);
        Length foots = Length.create(1, Unit.FOOT);
        assertEquals(foots, inches);
    }

    @Test
    void addTwoUnits() {
        Length unit1 = Length.create(1, Unit.INCHES);
        Length unit2 = Length.create(2, Unit.INCHES);
        assertEquals(Length.create(7.5, Unit.CENTIMETERS), unit1.add(unit2));
    }

    @Test
    void addTwoFootUnits() {
        Length unit1 = Length.create(2, Unit.FOOT);
        Length unit2 = Length.create(3, Unit.FOOT);
        assertEquals(Length.create(60, Unit.INCHES), unit1.add(unit2));
    }

    @Test
    void addTwoDiffUnits() {
        Length unit1 = Length.create(12, Unit.INCHES);
        Length unit2 = Length.create(1, Unit.FOOT);
        assertEquals(Length.create(24, Unit.INCHES), unit1.add(unit2));
    }

    @Test
    void addTwoAnotherUnits() {
        Length unit1 = Length.create(10, Unit.CENTIMETERS);
        Length unit2 = Length.create(1, Unit.CENTIMETERS);
        assertEquals(Length.create(4.4, Unit.INCHES), unit1.add(unit2));
    }
}