package _07_abstract_class_n_interface.shape_comparable;

import _06_inheritance.geometric.Shape;

public interface Comparable extends java.lang.Comparable<ComparableCircle> {
    int compareTo(ComparableCircle x);
}
