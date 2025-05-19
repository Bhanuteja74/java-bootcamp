package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Rectangle square = Rectangle.createSquare(5);
        assertEquals(square.area(), 25);
    }

    @Test
    void zeroArea() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(square.area(), 0);
    }

    @Test
    void perimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(5);
        assertEquals(square.perimeter(), 20);
    }

    @Test
    void evenSidePerimeterSquare() {
        Rectangle square = Rectangle.createSquare(6);
        assertEquals(square.perimeter(), 24 );
    }
}