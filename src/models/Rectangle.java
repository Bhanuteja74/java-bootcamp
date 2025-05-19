package models;

public class Rectangle implements Shapes {
    private final int length;
    private final int breath;
    private int length1;

    public Rectangle(int length , int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public int area() {
        return length * breath;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breath);
    }
}
