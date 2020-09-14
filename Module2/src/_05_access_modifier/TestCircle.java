package _05_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(4,"green");
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(9);
    }
}
