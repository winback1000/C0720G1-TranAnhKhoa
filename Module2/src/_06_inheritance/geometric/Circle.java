package _06_inheritance.geometric;

import _07_abstract_class_n_interface.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    double radius =1;
    public Circle () {
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*getRadius()*Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius = "+getRadius()+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent/100;
    }

}
