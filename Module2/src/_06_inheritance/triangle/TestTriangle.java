package _06_inheritance.triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(2,4,5,"red",false);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
