package _04_class_and_object_in_java;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input width");
        double width = sc.nextDouble();
        System.out.println("input height");
        double height = sc.nextDouble();
        RectangleClass rec = new RectangleClass(width, height);
        System.out.println("Area = " + rec.getArea());
        System.out.println("Perimeter = " + rec.getPerimeter());
        System.out.println(rec.display());
    }
}
