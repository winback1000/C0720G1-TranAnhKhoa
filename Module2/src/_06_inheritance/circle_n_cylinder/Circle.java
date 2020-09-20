package _06_inheritance.circle_n_cylinder;

public class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius = 1;
        this.color = "green";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
