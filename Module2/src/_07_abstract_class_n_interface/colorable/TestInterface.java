package _07_abstract_class_n_interface.colorable;

import _06_inheritance.geometric.Circle;
import _06_inheritance.geometric.Rectangle;
import _06_inheritance.geometric.Shape;
import _06_inheritance.geometric.Square;
import _07_abstract_class_n_interface.colorable.Colorable;

import java.util.Arrays;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,8);
        shapes[2] = new Square(6);
        System.out.println(Arrays.toString(shapes));
        for (Shape elem: shapes) {
            elem.resize(Math.random()*100);
            System.out.println(elem);
            System.out.println(elem.getArea());
            if (elem instanceof Colorable) {
                ((Colorable) elem).howToColor();
            }
        }
    }
}
