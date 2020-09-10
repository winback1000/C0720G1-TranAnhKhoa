package _02_loop_in_java.exercises;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number for checking");
        int num = sc.nextInt();
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        if ((num < 2) || (!check)) {
                System.out.println("this number is not a prime");
        } else {
                System.out.println("this number is a prime");
        }
    }
}

