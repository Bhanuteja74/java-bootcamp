package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void centimeterToMm() {
        Measurement cm = Measurement.create(1, Unit.CENTIMETERS);
        Measurement mm = Measurement.create(10, Unit.MILLIMETERS);
        assertEquals(cm, mm);
    }

    @Test
    void twoCmToMm() {
        Measurement cm = Measurement.create(2, Unit.CENTIMETERS);
        Measurement mm = Measurement.create(20, Unit.MILLIMETERS);
        assertEquals(cm, mm);
    }

    @Test
    void inchesToCm() {
        Measurement inches = Measurement.create(2, Unit.INCHES);
        Measurement cm = Measurement.create(5, Unit.CENTIMETERS);
        assertEquals(cm, inches);
    }

    @Test
    void footToInch() {
        Measurement inches = Measurement.create(12, Unit.INCHES);
        Measurement foots = Measurement.create(1, Unit.FOOT);
        assertEquals(foots, inches);
    }

    @Test
    void addTwoUnits() {
        Measurement unit1 = Measurement.create(1, Unit.INCHES);
        Measurement unit2 = Measurement.create(2, Unit.INCHES);
        assertEquals(Measurement.create(7.5, Unit.CENTIMETERS), unit1.add(unit2));
    }

    @Test
    void addTwoFootUnits() {
        Measurement unit1 = Measurement.create(2, Unit.FOOT);
        Measurement unit2 = Measurement.create(3, Unit.FOOT);
        assertEquals(Measurement.create(60, Unit.INCHES), unit1.add(unit2));
    }

    @Test
    void addTwoDiffUnits() {
        Measurement unit1 = Measurement.create(12, Unit.INCHES);
        Measurement unit2 = Measurement.create(1, Unit.FOOT);
        assertEquals(Measurement.create(24, Unit.INCHES), unit1.add(unit2));
    }

    @Test
    void addTwoAnotherUnits() {
        Measurement unit1 = Measurement.create(10, Unit.CENTIMETERS);
        Measurement unit2 = Measurement.create(1, Unit.CENTIMETERS);
        assertEquals(Measurement.create(4.4, Unit.INCHES), unit1.add(unit2));
    }

    // volumes

    @Test
    void gallonAndLiters() {
        Measurement gallon = Measurement.create(1, Unit.GALLON);
        Measurement liters = Measurement.create(3.78, Unit.LITERS);
        assertEquals(liters, gallon);
    }

    @Test
    void twoGallonsToLiters() {
        Measurement gallon = Measurement.create(2, Unit.GALLON);
        Measurement liters = Measurement.create(7.56, Unit.LITERS);
        assertEquals(liters, gallon);
    }

    @Test
    void addTwoVolumes() {
        Measurement gallon = Measurement.create(1, Unit.GALLON);
        Measurement liters = Measurement.create(1, Unit.LITERS);
        Measurement volume = Measurement.create(4.78, Unit.LITERS);

        assertEquals(volume, gallon.add(liters));
    }
}