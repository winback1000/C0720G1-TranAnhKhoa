package _06_inheritance.circle_n_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle cylinder1= new Cylinder();
        Cylinder cylinder2 = new Cylinder(5,8,"Red");
        Circle circle1 = new Circle(8,"Yellow");
        System.out.println(cylinder1.toString());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder2.toString());
        System.out.println(cylinder2.getVolumn());
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());
    }
}
