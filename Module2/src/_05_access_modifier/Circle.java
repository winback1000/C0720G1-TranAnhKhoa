package _05_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle (double radius, String color) {
        this.radius=radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }
    protected double getPerimeter() {
        return 2*getRadius()*Math.PI;
    }
    @Override
    public String toString() {
        return "This is a circle with r= "+getRadius()+"\n P = " +getPerimeter()+"\n S = "+getArea();
    }
}
