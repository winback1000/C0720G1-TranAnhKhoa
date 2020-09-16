package _06_inheritance.geometric;

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
        }
    }
}
