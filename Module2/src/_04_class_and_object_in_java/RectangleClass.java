package _04_class_and_object_in_java;

public class RectangleClass {
    double width;
    double height;

    public RectangleClass(double w, double h) {
        width = w;
        height = h;
    }
    public double getPerimeter() {
        return 2*(width+height);
    }
    public double getArea() {
        return width*height;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
