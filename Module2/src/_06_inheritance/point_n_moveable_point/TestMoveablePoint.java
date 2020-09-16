package _06_inheritance.point_n_moveable_point;

import java.util.Arrays;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint p1 = new MoveablePoint();
        MoveablePoint p2 = new MoveablePoint(4,5,6,7);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(Arrays.toString(p2.move()));
    }
}
