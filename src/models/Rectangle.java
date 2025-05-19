package models;

public class Rectangle  {
    private final int length;
    private final int breath;

    public Rectangle(int length , int breath) {
        this.length = length;
        this.breath = breath;
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 2 * (length + breath);
    }
}
