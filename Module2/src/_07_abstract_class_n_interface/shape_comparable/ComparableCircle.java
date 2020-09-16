package _07_abstract_class_n_interface.shape_comparable;

import _06_inheritance.geometric.Shape;

public class ComparableCircle extends  _06_inheritance.geometric.Circle implements Comparable {

    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle y) {
        return (this.getRadius() >= y.getRadius() ? 1 : -1);
    }
}

