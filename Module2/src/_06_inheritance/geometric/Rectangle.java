package _06_inheritance.geometric;

public class Rectangle extends Shape implements Resizeable {
    double length = 1;
    double width = 1;
    public Rectangle(){
    }
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle (double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }
    public double getArea() {
        return getLength()*getWidth();
    }
    @Override
    public String toString() {
        return "A Rectangle with width = "+getWidth()+" and length = "+getLength()+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length *= percent/100;
        this.width *= percent/100;
    }
}
