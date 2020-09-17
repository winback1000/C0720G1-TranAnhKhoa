package _06_inheritance.geometric;

public class Square extends Rectangle implements Resizeable, Colorable{
    double side = 1;

    public Square() {
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
    @Override
    public void resize(double percent) {
        this.side*=percent/100;
        this.width*= percent/100;
        this.length*= percent/100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
