package models;

public class Rectangle {
    private final int length;
    private final int breath;
    private int length1;

    public Rectangle(int length , int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 2 * (length + breath);
    }
}
