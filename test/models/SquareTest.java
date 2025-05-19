package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Square square = new Square(5);
        assertEquals(square.area(), 25);
    }

    @Test
    void zeroArea() {
        Square square = new Square(0);
        assertEquals(square.area(), 0);
    }

    @Test
    void perimeterOfSquare() {
        Square square = new Square(5);
        assertEquals(square.perimeter(), 20);
    }

    @Test
    void evenSidePerimeterSquare() {
        Square square = new Square(6);
        assertEquals(square.perimeter(), 24 );
    }
}