package _06_inheritance.point2d_point3d;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point3D(5,3,9);
        Point2D p2 = new Point2D(11.5f, 22.8f);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
