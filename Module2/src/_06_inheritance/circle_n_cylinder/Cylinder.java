package _06_inheritance.circle_n_cylinder;

public class Cylinder extends Circle{
    double height;
    public Cylinder() {
        this.radius =1;
        this.color = "Green";
        this.height = 1;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumn() {
        return super.getArea()*this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
