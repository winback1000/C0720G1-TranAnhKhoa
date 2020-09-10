package _02_loop_in_java.exercises;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a");
        int a = sc.nextInt();
        System.out.println("please input b");
        int b = sc.nextInt();
        if ((a == 0) && (b == 0)) {
            System.out.println("There is no common factor");
        } else if (Math.abs(a+b) == Math.abs(a-b)) {
            System.out.println("The common factor is: " + Math.abs(a+b));
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            int smaller = ((a+b) - Math.abs(a-b))/2;
            int common_factor = 1;
            for (int i = 1; i<=smaller;i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    common_factor = i;
                }
            }
            System.out.println("Common factor is: "+common_factor);
        }
    }
}
