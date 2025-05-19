package models;


public class Square {

    private final int side;

    public Square(int i) {
        this.side = i;
    }


    public int area() {
        Rectangle rectangle = new Rectangle(side, side);
        return rectangle.area();
    }

    public int perimeter() {
        Rectangle rectangle = new Rectangle(side, side);
        return rectangle.perimeter();
    }
}
