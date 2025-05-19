package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void Area() {
        Rectangle rectangle = new Rectangle(1,2);
        float area = rectangle.area();
        assertEquals(2,area);
    }

    @Test
    void zeroAreaTest() {
        Rectangle rectangle = new Rectangle(0,0);
        float area = rectangle.area();
        assertEquals(0,area);
    }

    @Test
    void squareAreaTest() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(rectangle.area(),4);
    }

    @Test
    void breathZeroAreaTest() {
        Rectangle rectangle = new Rectangle(1,0);
        assertEquals(rectangle.area(),0);

    }

    @Test
    void squarePerimeterTest() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(rectangle.perimeter(), 8);
    }

    @Test
    void zeroPerimeter() {
        Rectangle rectangle = new Rectangle(0,0);
        assertEquals(rectangle.perimeter(),0);
    }


}