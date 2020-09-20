package _07_abstract_class_n_interface.shape_comparable;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        System.out.println(Arrays.toString(circles));

        Arrays.sort(circles);
        System.out.println("After-sorted:");
        System.out.println(Arrays.toString(circles));

        for (int i = 0; i<2;i++) {
            System.out.println(circles[i].compareTo(circles[i+1]));
        }
    }
}
