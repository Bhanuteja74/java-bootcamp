package models;


public class Square implements Shapes {

    private final int side;

    public Square(int side) {
        this.side = side;
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
