package _06_inheritance.geometric;

public class Square extends Rectangle {
    double side;

    public Square() {
        this.width = 1;
        this.length = 1;
    }
    public Square (double side) {
        this.width = side;
        this.length = side;
    }
    public Square (double side, String color, boolean filled) {
        super(side,side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth (double side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }
    @Override
    public void setLength (double side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }
    @Override
    public String toString() {
        return "A Square with side = "+getWidth()+", which is a subclass of "+super.toString();
    }
}
