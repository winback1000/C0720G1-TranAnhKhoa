package _06_inheritance.triangle;

public class Triangle extends _06_inheritance.geometric.Shape {
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;
    public Triangle() {}
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        double s = (side1 + side2 + side3) / 2;
        if (s > side1 && s > side2 && s > side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("These values are not for a triangle, the values will be reverted to default");
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +'\'' +
                ", side2=" + side2 +'\'' +
                ", side3=" + side3 +'\'' +
                ", perimeter =" + getPerimeter() +'\'' +
                ", area =" + getArea() +'\'' +
                "} " + super.toString();
    }
}
